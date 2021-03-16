package com.example.myshoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMain = findViewById(R.id.button_view_list);
        TextView itemView = findViewById(R.id.textView1);
        TextView itemView2 = findViewById(R.id.textView2);
        Intent receiveItems = getIntent();
        String receive = receiveItems.getStringExtra("items");
        itemView.setText(receive);
        itemView2.setText(receive);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, itemList.class);
                startActivity(intent);
            }
        });

    }
}