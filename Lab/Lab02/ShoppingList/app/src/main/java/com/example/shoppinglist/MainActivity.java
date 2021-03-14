package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private static final String EXTRA_MESSAGE = "com.example.android.shoppinglist.extra.MESSAGE" ;
    private TextView item1;
    private TextView item2;
    private Button addItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItem = (Button) findViewById(R.id.button_main);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.view_item);
        textView.setText(message);
        TextView textView1 = findViewById(R.id.view_item2);
        textView.setText(message2);
        



    }

    private void openNewActivity() {
        Intent start = new Intent(this, ItemList.class);
        startActivity(start);
    }
}