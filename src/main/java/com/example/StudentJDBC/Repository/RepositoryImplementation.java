package com.example.StudentJDBC.Repository;

import com.example.StudentJDBC.Exception.StudentNotFoundException;
import com.example.StudentJDBC.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.sql.PreparedStatement;

@Repository
public class RepositoryImplementation implements Repository
{
    Student student=new Student();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }


    //void saveStudent(Student student);
//    @Override
//    private void addStudent(Student student) {
//        String addQuery = "Insert Details values(?,?,?,?)";
//        Object detailsArray[] = {student.getName(), student.getGender(), student.getAge(), student.getSports()};
//
//        jdbcTemplate.update(addQuery,detailsArray);
//    }
//
//    @Override
//    private void updateStudent(int roll_no)
//    {
//        String updateQuery="update name=?,gender=?,age=?,sports=?";
//        Object update[]={student.getName(),student.getGender(), student.getAge(), student.getSports()};
//        jdbcTemplate.update(updateQuery,update);
//    }
//    @Override
//    void deleteStudent(int roll_no);
//    {
//        String deleteQuery="Delete roll_no=?";
//        jdbcTemplate.update(deleteQuery,roll_no);
//    }
//
//    @Override
//    Student findById(int roll_no) throws StudentNotFoundException;
}
