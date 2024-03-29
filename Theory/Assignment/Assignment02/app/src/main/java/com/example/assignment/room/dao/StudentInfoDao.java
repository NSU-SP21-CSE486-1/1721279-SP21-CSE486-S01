package com.example.assignment.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.assignment.room.entity.StudentInfo;

import java.util.List;

@Dao
public interface StudentInfoDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(StudentInfo studentInfo);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAll(StudentInfo... studentInfos);

    @Query("SELECT id FROM student_info ORDER BY id ASC")
    LiveData<List<Integer>> getAllIds();

    @Query("SELECT * FROM student_info ORDER BY id ASC")
    LiveData<List<StudentInfo>> getAllStudents();

    @Query("SELECT * FROM student_info WHERE id LIKE :studentID LIMIT 1")
    LiveData<StudentInfo> getStudent(Integer studentID);

    @Update
    void update(StudentInfo studentInfo);

    @Update
    void updateAll(StudentInfo... studentInfo);

    @Delete
    void delete(StudentInfo studentInfo);

    @Delete
    void deleteAll(StudentInfo... studentInfos);
}
