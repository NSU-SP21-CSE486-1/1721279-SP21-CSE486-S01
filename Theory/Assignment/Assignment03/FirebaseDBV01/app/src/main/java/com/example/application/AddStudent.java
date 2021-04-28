package com.example.application;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AddStudent extends AppCompatActivity {
    Button dateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        final EditText eName = findViewById(R.id.editText_name);
        final EditText eId = findViewById(R.id.editText_id);
        final Spinner eSchool = findViewById(R.id.spinner_school);
        final Spinner eDepartment = findViewById(R.id.spinner_department);
        dateButton = findViewById(R.id.button_datePicker);
        final EditText ePhone = findViewById(R.id.editText_phone);
        final EditText eNid = findViewById(R.id.editText_nid);
        Button btn = findViewById(R.id.button_save);

        StudentDAO dao = new StudentDAO();

        btn.setOnClickListener(v -> {

            String name = eName.getText().toString();
            String idString = eId.getText().toString();
            Integer id = Integer.valueOf(idString);
            String school = eSchool.getSelectedItem().toString();
            String department = eDepartment.getSelectedItem().toString();
            String dateOfBirth = dateButton.getText().toString();
            String phoneString = ePhone.getText().toString();
            Integer phone = Integer.valueOf(phoneString);
            String nidString = eNid.getText().toString();
            Integer nid = Integer.valueOf(nidString);


            Students student = new Students(name,id,school,department,dateOfBirth,phone,nid);
            eName.setText("");
            eId.setText("");
            dateButton.setText("");
            ePhone.setText("");
            eNid.setText("");


            dao.add(student).addOnSuccessListener(suc ->{

                Toast.makeText(this,"Data Inserted",Toast.LENGTH_SHORT).show();


            }).addOnFailureListener(er ->{

                Toast.makeText(this,"Enter Data",Toast.LENGTH_SHORT).show();

            });

        });

    }

    public void openDatePicker(View view) {
        int day,month,year;
        Calendar calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month +1;
                String date = dayOfMonth + "-" + month + "-" + year;
                dateButton.setText(date);

            }
        },year, month, day);
        datePickerDialog.show();
    }
}