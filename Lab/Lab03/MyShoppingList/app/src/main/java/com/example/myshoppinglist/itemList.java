package com.example.myshoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class itemList extends AppCompatActivity {
     private  ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        final ListView list = findViewById(R.id.theList);
        ArrayList<String> itemNames = new ArrayList<>();
        itemNames.add("Apple");
        itemNames.add("Milk");
        itemNames.add("Rice");
        itemNames.add("Mango");
        itemNames.add("Egg");
        itemNames.add("Bread");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,itemNames);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(itemList.this, "You clicked on:" + itemNames.get(position), Toast.LENGTH_SHORT).show();
                Intent sendItems = new Intent(itemList.this, MainActivity.class);
                sendItems.putExtra("items", itemNames.get(position));
                startActivity(sendItems);
            }
        });

    }
}