package com.example.assignment.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_info")
public class StudentInfo {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private final Integer studentID;

    @ColumnInfo(name = "name")
    private String studentName;

    @ColumnInfo(name = "school")
    private String schoolName;

    @ColumnInfo(name = "department")
    private String departmentName;

    @ColumnInfo(name = "date of birth")
    private Integer dateOfBirth;

    @ColumnInfo(name = "phone")
    private Integer phoneNumber;

    @ColumnInfo(name = "NID")
    private Integer nID;

    public StudentInfo(@NonNull Integer studentID
            , String studentName
            , String  schoolName
            , String  departmentName
            , @NonNull Integer dateOfBirth
            , @NonNull Integer phoneNumber
            , @NonNull Integer nID){
        this.studentID = studentID;
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.departmentName = departmentName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nID = nID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNID(Integer nID) {
        this.nID = nID;
    }





    @NonNull
    public Integer getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getNID() {
        return nID;
    }

}
