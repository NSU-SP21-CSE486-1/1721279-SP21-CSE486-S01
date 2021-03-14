package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemList extends AppCompatActivity {


    private static final String EXTRA_MESSAGE = "com.example.android.shoppinglist.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        Button item = (Button) findViewById(R.id.button_item);
        Button item2 = (Button) findViewById(R.id.button_item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem2();
            }
        });
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             addItem();

            }
        });
    }

    private void addItem2() {
        Intent add = new Intent(this, MainActivity.class);
        String message2 = "Milk";
        add.putExtra(EXTRA_MESSAGE,message2);
        startActivity(add);
    }

    private void addItem() {

        Intent add = new Intent(this, MainActivity.class);
        String message = "Apple";
        add.putExtra(EXTRA_MESSAGE,message);
        startActivity(add);


    }
}