package com.example.StudentJDBC.Exception;

public class StudentNotFoundException extends RuntimeException
{
    public StudentNotFoundException()
    {
        System.out.println("Student Doesn't Exist");
    }


    public StudentNotFoundException(String x)
    {
        System.out.println("Student Doesn't Exist");
    }


    public StudentNotFoundException(int x)
    {
        System.out.println("Student Doesn't Exist");
    }
}
