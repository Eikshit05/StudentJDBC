package com.example.StudentJDBC;

import com.example.StudentJDBC.Model.Student;
import com.example.StudentJDBC.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentJdbcApplication implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(StudentJdbcApplication.class, args);
	}

	private Service service;
	@Autowired
	private void setService(Service service)
	{
		this.service=service;
	}

	@Override
	public void run(String... args) throws Exception
	{
		Student student=new Student(1,"Eikshit","Male",20,"Football");
		System.out.println("STUDENT ADDED");
	}
}
