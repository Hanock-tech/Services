package com.csv2jsontask.model;

import java.util.List;

public class Teacher extends Personnel {

	private String empNo;
	private String classTeacherOf;
	private String post;
	private String salary;

	private String servicePeriod;
	private String perviousSchool;

	private String dateOfJoining;
	private List<String> subjectTeachers;

	public Teacher() {

	}

	public Teacher(Integer id, String fullName, String gender, String aadhar, String age, String city, String contact,String empNo,String classTeacherOf,String post,String salary,String servicePeriod,String perviousSchool,List<String> subjectTeacher) {
		super(id, fullName, gender, aadhar, age, city, contact);
		this.empNo = empNo;
		this.classTeacherOf = classTeacherOf;
		this.post = post;
		this.salary = salary;
		this.servicePeriod = servicePeriod;
		this.perviousSchool = perviousSchool;
	    this.subjectTeachers=subjectTeacher;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public List<String> getSubjectTeachers() {
		return subjectTeachers;
	}

	public void setSubjectTeachers(List<String> subjectTeachers) {
		this.subjectTeachers = subjectTeachers;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getClassTeacherOf() {
		return classTeacherOf;
	}

	public void setClassTeacherOf(String classTeacherOf) {
		this.classTeacherOf = classTeacherOf;
	}

	public String getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public String getPerviousSchool() {
		return perviousSchool;
	}

	public void setPerviousSchool(String perviousSchool) {
		this.perviousSchool = perviousSchool;
	}

}
