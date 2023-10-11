package com.example.StudentJDBC.Model;


public class Student
{

    private int roll_no;
    private String name;
    private String gender;
    private int age;
    private String sports;

    public Student(int roll_no, String name, String gender, int age, String sports) {
        this.roll_no = roll_no;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sports = sports;
    }

    public Student() {
        super();
    }


    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

}

