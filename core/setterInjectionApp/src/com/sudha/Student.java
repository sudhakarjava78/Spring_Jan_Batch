package com.sudha;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String sid;
	private String sname;
	private Address saddr;
	private List<String> squal;
	private Set<String> scourses;
	private Map<String,String> scourse_faculty;
	private Properties scourse_cost;

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("=====================");
		System.out.println("Student Id :" + sid);
		System.out.println("Student Name :" + sname);
		System.out.println("Student Address :" + saddr);
		System.out.println("Student Qualification :" + squal);
		System.out.println("Student Courses :"+scourses);
		System.out.println("Student Course And Faculty :"+scourse_faculty);
		System.out.println("Student Course And Cost :"+scourse_cost);
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

	public Address getSaddr() {
		return saddr;
	}

	public void setSaddr(Address saddr) {
		this.saddr = saddr;
	}

	public List<String> getSqual() {
		return squal;
	}

	public void setSqual(List<String> squal) {
		this.squal = squal;
	}

	public Set<String> getScourses() {
		return scourses;
	}

	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}


	public Map<String, String> getScourse_faculty() {
		return scourse_faculty;
	}

	public void setScourse_faculty(Map<String, String> scourse_faculty) {
		this.scourse_faculty = scourse_faculty;
	}

	public Properties getScourse_cost() {
		return scourse_cost;
	}

	public void setScourse_cost(Properties scourse_cost) {
		this.scourse_cost = scourse_cost;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + ", squal=" + squal + ", scourses="
				+ scourses + ", scourse_faculty=" + scourse_faculty + ", scourse_cost=" + scourse_cost + "]";
	}

	

}
