package com.example.assignment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     EditText name;
     EditText id;
     EditText phone;
     EditText nid;
     Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editText_name);
        id = findViewById(R.id.editText_id);
        phone = findViewById(R.id.editText_phone);
        nid = findViewById(R.id.editText_nid);
        next = findViewById(R.id.button_next);


    }
}