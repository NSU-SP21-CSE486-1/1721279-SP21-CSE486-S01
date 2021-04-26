package com.example.application;

public class Students {
    private String name;
    private Integer id;
    private String school;
    private String department;
    private String dateOfBirth;
    private Integer phone;
    private Integer nid;
    public  Students(){}

    public Students(String name, Integer id,String school,String department,String dateOfBirth,Integer phone,Integer nid)
    {
        this.name = name;
        this.id = id;
        this.school = school;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.nid = nid;
    }

    public String getName() {

        return name;
    }

    public Integer getId() {

        return id;
    }

    public String getSchool() {

        return school;
    }

    public String getDepartment() {

        return department;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getPhone() {
        return phone;
    }

    public Integer getNid() {
        return nid;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public void setSchool(String school) {

        this.school = school;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }
}
