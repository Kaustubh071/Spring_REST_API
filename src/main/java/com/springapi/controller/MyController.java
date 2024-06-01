package com.springapi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.model.Student;
import com.springapi.repo.MyRepo;

import java.util.List;

@RestController
public class MyController {
	
	@Autowired
	MyRepo db;
	@RequestMapping("/")
	
	String fun()
	{
		return "Hello Student";
	}
	
	@RequestMapping("/test1")
	Student myfun1()
	{
		Student s = new Student(3,"Jay","Nagpur",87.8);
		
		return s;
	}
	
	@RequestMapping("/test2")
	ArrayList<Student> myfun2()
	{
		Student s=new Student(101,"Ram","Nagpur",78.3);
		Student s1=new Student(102,"sham","Nagpur",78.3);
		Student s2=new Student(101,"Om","Nagpur",78.3);
		Student s3=new Student(109,"Geeta","Nagpur",78.3);
		Student s4=new Student(101,"ved","Nagpur",78.3);
		Student s5=new Student(107,"Ram","Nagpur",78.3);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		return al;
	}
	
	@RequestMapping("/test3")
	List<Student> myfun()
	{
		List<Student> s = db.findAll();
		
		return s;
	}

}
