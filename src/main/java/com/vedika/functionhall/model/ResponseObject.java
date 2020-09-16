package com.vedika.functionhall.model;

import java.util.Date;

public class ResponseObject {
	private String requestId;
	private String mobileNumber;
	private String message;
    private String token;
    private Date expirationtime;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpirationtime() {
		return expirationtime;
	}

	public void setExpirationtime(Date expirationtime2) {
		this.expirationtime = expirationtime2;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseObject [requestId=" + requestId + ", mobileNumber=" + mobileNumber + ", message=" + message
				+  "]";
	}

	
}
