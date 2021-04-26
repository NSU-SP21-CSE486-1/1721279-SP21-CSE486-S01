package com.example.application;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StudentDAO {
    private final DatabaseReference databaseReference;

    public StudentDAO(){

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Students.class.getSimpleName());

    }
    public Task<Void> add (Students student){

       return databaseReference.push().setValue(student);
    }
}
