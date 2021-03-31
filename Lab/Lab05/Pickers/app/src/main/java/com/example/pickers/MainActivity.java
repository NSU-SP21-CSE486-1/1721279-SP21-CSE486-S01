package com.example.pickers;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    TextView mTextView;
    int day;
    int month;
    int year;
    Button tButton;
    TextView tTextView;
    int hour;
    int minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button_date);
        mTextView = findViewById(R.id.textView);
        tButton = findViewById(R.id.button_time);
        tTextView = findViewById(R.id.textView2);

        mButton.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            day = calendar.get(Calendar.DAY_OF_MONTH);
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    month = month +1;
                    String date = dayOfMonth + "-" + month + "-" + year;
                    mTextView.setText(date);

                }
            },year, month, day);
            datePickerDialog.show();

        });


    }

    public void popTimePicker(View view) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener()
        {
            @Override
            public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute)
            {
                hour = selectedHour;
                minutes = selectedMinute;
                tTextView.setText(String.format(Locale.getDefault(), "%02d:%02d", hour, minutes));
            }
        };

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, onTimeSetListener, hour, minutes, true);
        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }
}