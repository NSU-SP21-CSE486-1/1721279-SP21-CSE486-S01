package com.example.login;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView mName;
    SharedPreferences ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mName = findViewById(R.id.textView_name);
        ref = getSharedPreferences("com.example.login",MODE_PRIVATE);
        mName.setText(ref.getString("email",""));
    }
}