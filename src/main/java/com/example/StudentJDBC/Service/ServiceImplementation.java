package com.example.StudentJDBC.Service;

import com.example.StudentJDBC.Exception.StudentNotFoundException;
import com.example.StudentJDBC.Model.Student;
import com.example.StudentJDBC.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public interface ServiceImplementation extends Service
{


    @Autowired
    private Repository repository;


    private void setRepository(Repository repository)
    {
        this.repository=repository;
    }

    default void setRepository(Repository repository)
    {
        this.repository=repository;
    }
    //@Override
    //void saveStudent(Student student);

    default void addStudent(Student student)
    {
        repository.addStudent(student);
    }

    default void updateStudent(int roll_no)
    {
        repository.updateStudent(roll_no);
    }

    default void deleteStudent(int roll_no)
    {
        repository.deleteStudent(roll_no;
    }


    Student getById(int roll_no) throws StudentNotFoundException;

}
