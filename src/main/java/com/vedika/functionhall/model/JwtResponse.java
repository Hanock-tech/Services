package com.vedika.functionhall.model;

import java.io.Serializable;
import java.util.Date;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;

	private String msg;
	private String firstName;

	private final String jwttoken;
	private final String Expirationtime;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public JwtResponse(String jwttoken, String strDate, String firstName, String msg) {

		this.Expirationtime = strDate;
		this.jwttoken = jwttoken;
		this.firstName = firstName;
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public String getExpirationtime() {
		return Expirationtime;
	}

}
