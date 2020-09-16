package com.vedika.functionhall.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booking_slot")

public class BookingSlot {

	private String functionhallId;
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private String date;
	private String timeSlot;

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getFunctionhallId() {
		return functionhallId;
	}

	public void setFunctionhallId(String functionhallId) {
		this.functionhallId = functionhallId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookingSlot [functionhallId=" + functionhallId + ", data=" + data + ", date=" + date + ", timeSlot="
				+ timeSlot + "]";
	}

}
