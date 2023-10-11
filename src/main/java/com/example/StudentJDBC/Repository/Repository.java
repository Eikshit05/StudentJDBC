package com.example.StudentJDBC.Repository;

import com.example.StudentJDBC.Exception.StudentNotFoundException;
import com.example.StudentJDBC.Model.Student;

import java.util.List;
public interface Repository
{

    //void saveStudent(Student student);
    public void addStudent(Student student);
    public void updateStudent(int roll_no);
    public void deleteStudent(int roll_no);

    Student findById(int roll_no) throws StudentNotFoundException;

    List<Student> findByName(String name) throws StudentNotFoundException;

    List<Student> findByGender(String gender) throws StudentNotFoundException;

    List<Student> findByAge(int age) throws StudentNotFoundException;

    List<Student> findBySports(String sports) throws StudentNotFoundException;
}
