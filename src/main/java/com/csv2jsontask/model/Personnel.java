package com.csv2jsontask.model;

public class Personnel {

	private Integer id;
	private String fullName;
	private String gender;
	private String dob;
	private String aadhar;
	private String age;
	private String city;
	private String contact;

	public Personnel() {

	}

	public Personnel(Integer id, String fullName, String gender, String aadhar, String age, String city,
			String contact) {

		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.aadhar = aadhar;
		this.age = age;
		this.city = city;
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Personnel [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", dob=" + dob + ", aadhar="
				+ aadhar + ", age=" + age + ", city=" + city + ", contact=" + contact + "]";
	}

}
