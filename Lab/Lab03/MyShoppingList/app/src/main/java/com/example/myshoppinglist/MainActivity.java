package com.example.myshoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMain = findViewById(R.id.button_view_list);
        Button btnSnd = findViewById(R.id.button_view_location);
        mLocation = findViewById(R.id.editText);
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

        btnSnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc = mLocation.getText().toString();
                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent find = new Intent(Intent.ACTION_VIEW, addressUri);
                if (find.resolveActivity(getPackageManager()) != null) {
                    startActivity(find);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
            }
        });


    }
}