package com.example.application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private  Context context;
    ArrayList<Students> list = new ArrayList<>();
    public Adapter(Context ctx){
     this.context = ctx;
    }

    public void setItems(ArrayList<Students> student){

        list.addAll(student);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StudentViewHolder vh = (StudentViewHolder) holder;
        Students student  = list.get(position);
        vh.txt_name.setText(student.getName());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
