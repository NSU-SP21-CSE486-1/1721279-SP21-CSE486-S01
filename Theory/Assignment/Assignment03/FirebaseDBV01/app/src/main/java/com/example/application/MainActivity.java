package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button studentAdd;
    Button studentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentAdd = findViewById(R.id.button_main_add);
        studentView = findViewById(R.id.button_main_view);

        studentAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });
        studentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewActivity();
            }
        });


    }

    private void viewActivity() {
        Intent intent = new Intent(this,ViewStudent.class);
        startActivity(intent);

    }

    private void nextActivity() {
        Intent intent = new Intent(this,AddStudent.class);
        startActivity(intent);
    }
}