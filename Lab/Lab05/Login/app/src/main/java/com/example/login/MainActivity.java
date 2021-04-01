package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SharedPreferences ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText mEmail = findViewById(R.id.editText_email);
        EditText mPassword = findViewById(R.id.editText_password);
        Button btnLogin = findViewById(R.id.button_login);
        ImageView imageView = findViewById(R.id.imageView_user);


        ref = getSharedPreferences("com.example.login",MODE_PRIVATE);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();

                ref.edit().putString("email",email).apply();
                ref.edit().putString("password",password).apply();

                if(email.equals("admin") && password.equals("admin")){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast toast= Toast. makeText(getApplicationContext(),"Invalid",Toast. LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }
}