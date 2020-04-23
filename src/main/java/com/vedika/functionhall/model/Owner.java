package com.vedika.functionhall.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "owner")
public class Owner {
    @Id
    private String id;
	private String ownerFirstName;
  	private String ownerLastName;

    private List<FunctionHall> functionhall;
   
    
    
	public Owner() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public List<FunctionHall> getFunctionhall() {
		return functionhall;
	}

	public void setFunctionhall(List<FunctionHall> functionhall) {
		this.functionhall = functionhall;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", ownerFirstName=" + ownerFirstName + ", ownerLastName=" + ownerLastName
				+ ", functionhall=" + functionhall + "]";
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}
  
    
}