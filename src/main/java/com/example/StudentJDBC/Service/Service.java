package com.example.StudentJDBC.Service;

import com.example.StudentJDBC.Exception.StudentNotFoundException;
import com.example.StudentJDBC.Model.Student;
import com.example.StudentJDBC.Repository.Repository;

import java.util.List;
@org.springframework.stereotype.Service
public interface Service
{

    private Repository repository;

    private void setRepository(Repository repository)
    {
        this.repository=repository;
    }
    //void saveStudent(Student student);
    void addStudent(Student student);
    void updateStudent(int roll_no);
    void deleteStudent(int roll_no);

    Student getById(int roll_no) throws StudentNotFoundException;

    List<Student> getByName(String name) throws StudentNotFoundException;

    List<Student> getByGender(String gender) throws StudentNotFoundException;

    List<Student> getByAge(int age) throws StudentNotFoundException;

    List<Student> getBySports(String sports) throws StudentNotFoundException;

}
