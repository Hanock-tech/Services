package com.vedika.functionhall.model;

public class UserLogin {
	private String mobileNumber;
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String otp;
	private long expiretime;
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	@Override
	public String toString() {
		return "UserLogin [mobileNumber=" + mobileNumber + ", otp=" + otp + ", expiretime=" + expiretime + "]";
	}
	public long getExpiretime() {
		return expiretime;
	}
	public void setExpiretime(long expiretime) {
		this.expiretime = expiretime;
	}
	
	

}
