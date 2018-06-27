package com.example.springbootmybatis.domain;

import java.util.Date;

public class Student {
    private Integer id;
    private String  loginPwd;
    private String studentName;
    private String sex;
    private  String gradeID;
    private String phone;
    private String address;
    private String bornDate;

    public Student(int id, String loginPwd, String studentName, String sex, String gradeID, String phone, String address, String bornDate) {
        this.id = id;
        this.loginPwd = loginPwd;
        this.studentName = studentName;
        this.sex = sex;
        this.gradeID = gradeID;
        this.phone = phone;
        this.address = address;
        this.bornDate = bornDate;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", loginPwd='" + loginPwd + '\'' +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", gradeID='" + gradeID + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", bornDate=" + bornDate +
                '}';
    }
}
