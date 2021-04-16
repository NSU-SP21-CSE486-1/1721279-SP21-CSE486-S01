package com.example.assignment.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.assignment.room.dao.StudentInfoDao;
import com.example.assignment.room.database.AppDatabase;
import com.example.assignment.room.entity.StudentInfo;

import java.util.List;

public class StudentRepository {
    private StudentInfoDao mStudentInfoDao;
    private LiveData<List<Integer>> mAllStudentIds;
    private LiveData<List<StudentInfo>> mAllStudents;


    public StudentRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        mStudentInfoDao = db.studentInfoDao();
        mAllStudentIds = mStudentInfoDao.getAllIds();
        mAllStudents = mStudentInfoDao.getAllStudents();
    }

    public LiveData<List<Integer>> getAllStudentIDs(){
        return mAllStudentIds;
    }

    public LiveData<List<StudentInfo>> getAllStudents(){
        return mAllStudents;
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    public LiveData<StudentInfo> getStudent(Integer id){
        return mStudentInfoDao.getStudent(id);
    }

    public void insert(StudentInfo studentInfo){
        AppDatabase.getDatabaseWriteExecutor().execute(()->{
            mStudentInfoDao.insert(studentInfo);
        });
    }

    public void insertAll(StudentInfo... studentInfos){
        AppDatabase.getDatabaseWriteExecutor().execute(()->{
            mStudentInfoDao.insertAll(studentInfos);
        });
    }
}