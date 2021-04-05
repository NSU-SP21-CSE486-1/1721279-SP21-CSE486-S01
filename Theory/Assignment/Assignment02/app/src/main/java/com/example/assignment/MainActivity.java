package com.example.assignment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
     EditText name;
     EditText id;
     EditText phone;
     EditText nid;
     Button next;
     Button dateButton;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editText_name);
        id = findViewById(R.id.editText_id);
        phone = findViewById(R.id.editText_phone);
        nid = findViewById(R.id.editText_nid);
        next = findViewById(R.id.button_next);
        dateButton = findViewById(R.id.button_datePicker);






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

    public void nextActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}