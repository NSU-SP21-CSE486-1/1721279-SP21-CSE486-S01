package com.example.assignment.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.assignment.repository.StudentRepository;
import com.example.assignment.room.entity.StudentInfo;

import java.util.List;

public class StudentInfoViewModel extends AndroidViewModel {

    private StudentRepository mRepository;
    private LiveData<List<Integer>> mAllStudentIds;
    private LiveData<List<StudentInfo>> mAllStudents;

    public StudentInfoViewModel(@NonNull Application application) {
        super(application);
        mRepository = new StudentRepository(application);
        mAllStudentIds = mRepository.getAllStudentIDs();
        mAllStudents = mRepository.getAllStudents();
    }

    public LiveData<List<Integer>> getAllStudentIds() {
        return mAllStudentIds;
    }
    public LiveData<List<StudentInfo>> getAllStudents() {return mAllStudents;}

    public void insert(StudentInfo info){
        mRepository.insert(info);
    }
    public void insertAll(StudentInfo... infos){
        mRepository.insertAll(infos);
    }

    public LiveData<StudentInfo> getStudent(Integer id){
        return mRepository.getStudent(id);
    }
}
