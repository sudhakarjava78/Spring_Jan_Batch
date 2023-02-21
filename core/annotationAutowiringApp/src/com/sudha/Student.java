package com.sudha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String sid;
	private String sname;
	private Course course;
	
	
	@Autowired
	public Student(String sid, String sname, @Qualifier("Adv_Java") Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("==================");
		System.out.println("Student Id :"+sid);
		System.out.println("Student Name :"+sname);
		System.out.println("Course Details");
		System.out.println("==================");
		System.out.println("Course Name :"+course.getCid());
		System.out.println("Course Name :"+course.getCname());
		System.out.println("Course Name :"+course.getCcost());
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCourse() {
		return course;
	}


	//@Required
	//@Autowired(required = true)
	//@Qualifier("Core_Java")
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}

	
}
