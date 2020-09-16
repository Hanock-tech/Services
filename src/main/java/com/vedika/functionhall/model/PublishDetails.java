package com.vedika.functionhall.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "functionhall_reference_data")

public class PublishDetails {
	private String ownerId;
	private String corelationId;
	private Location location;
	private FunctionHall details;
	private AccountDetails accountDetails;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getCorelationId() {
		return corelationId;
	}

	public void setCorelationId(String corelationId) {
		this.corelationId = corelationId;
	}

	public FunctionHall getDetails() {
		return details;
	}

	public void setDetails(FunctionHall details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "PublishDetails [ownerId=" + ownerId + ", corelationId=" + corelationId + ", location=" + location
				+ ", details=" + details + ", accountDetails=" + accountDetails + "]";
	}

}
