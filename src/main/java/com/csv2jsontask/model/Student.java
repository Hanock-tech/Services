package com.csv2jsontask.model;

public class Student extends Personnel {

	private Integer rollNumber;
	private String standard;
	private Integer totalMarks;
	private String grade;
	private Integer secPercentage;
	private String hsStream;

	public Student() {

	}

	public Student(Integer id, String fullName, String gender, String aadhar, String age, String city, String contact,
			Integer rollNumber, String standard, Integer totalMarks, String grade, Integer secPercentage,
			String hsStream) {
		super(id, fullName, gender, aadhar, age, city, contact);

		this.rollNumber = rollNumber;
		this.standard = standard;
		this.totalMarks = totalMarks;
		this.grade = grade;
		this.secPercentage = secPercentage;
		this.hsStream = hsStream;

	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getSecPercentage() {
		return secPercentage;
	}

	public void setSecPercentage(Integer secPercentage) {
		this.secPercentage = secPercentage;
	}

	public String getHsStream() {
		return hsStream;
	}

	public void setHsStream(String hsStream) {
		this.hsStream = hsStream;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", standard=" + standard + ", totalMarks=" + totalMarks
				+ ", grade=" + grade + ", secPercentage=" + secPercentage + "]";
	}

}
