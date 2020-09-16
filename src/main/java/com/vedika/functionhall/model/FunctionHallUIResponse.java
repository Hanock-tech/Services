package com.vedika.functionhall.model;

import java.util.Arrays;

public class FunctionHallUIResponse {

	private String name;
	private String ownerFirstName;
	private String ownerLastName;
	private String ownerId;
	private String functionhalldescription;
	private String functionhalltype;
	private String foodtype;
	private int maximumguest;
	private String roomtype;
	private String ownerContactNumber;
	private String[] ImageUrl;
	private String street;
	private String state;
	private Boolean parking;
	private Boolean internet;
	private Boolean nosmoking;
	private Boolean airconditioning;
	private Boolean soundsystem;
	private Boolean lightingsystem;
	private Boolean dancefloor;
	private Boolean noalcohol;
	private Boolean banquethall;
	private Boolean partyroom;
	private Boolean conference;
	private Boolean performance;
	private Boolean weddinghall;
	private Boolean nightclub;
	private Boolean eventspace;

	private String correlationid;

	public Boolean getBanquethall() {
		return banquethall;
	}

	public void setBanquethall(Boolean banquethall) {
		this.banquethall = banquethall;
	}

	public Boolean getPartyroom() {
		return partyroom;
	}

	public void setPartyroom(Boolean partyroom) {
		this.partyroom = partyroom;
	}

	public Boolean getConference() {
		return conference;
	}

	public void setConference(Boolean conference) {
		this.conference = conference;
	}


	public Boolean getPerformance() {
		return performance;
	}

	public void setPerformance(Boolean performance) {
		this.performance = performance;
	}

	public Boolean getWeddinghall() {
		return weddinghall;
	}

	public void setWeddinghall(Boolean weddinghall) {
		this.weddinghall = weddinghall;
	}

	public Boolean getNightclub() {
		return nightclub;
	}

	public void setNightclub(Boolean nightclub) {
		this.nightclub = nightclub;
	}

	public Boolean getEventspace() {
		return eventspace;
	}

	public void setEventspace(Boolean eventspace) {
		this.eventspace = eventspace;
	}

	public void setNoalocohol(Boolean noalcohol) {
		this.noalcohol = noalcohol;
	}

	public Boolean getParking() {
		return parking;
	}

	public void setParking(Boolean parking) {
		this.parking = parking;
	}

	public Boolean getInternet() {
		return internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
	}

	public Boolean getNosmoking() {
		return nosmoking;
	}

	public void setNosmoking(Boolean nosmoking) {
		this.nosmoking = nosmoking;
	}

	public Boolean getAirconditioning() {
		return airconditioning;
	}

	public void setAirconditioning(Boolean airconditioning) {
		this.airconditioning = airconditioning;
	}

	public Boolean getSoundsystem() {
		return soundsystem;
	}

	public void setSoundsystem(Boolean soundsystem) {
		this.soundsystem = soundsystem;
	}

	public Boolean getLightingsystem() {
		return lightingsystem;
	}

	public void setLightingsystem(Boolean lightingsystem) {
		this.lightingsystem = lightingsystem;
	}

	public Boolean getDancefloor() {
		return dancefloor;
	}

	public void setDancefloor(Boolean dancefloor) {
		this.dancefloor = dancefloor;
	}

	public Boolean getNoalcohol() {
		return noalcohol;
	}

	public void setNoalcohol(Boolean noalcohol) {
		this.noalcohol = noalcohol;
	}

	public String getFunctionhalldescription() {
		return functionhalldescription;
	}

	public void setFunctionhalldescription(String functionhalldescription) {
		this.functionhalldescription = functionhalldescription;
	}

	public String getFunctionhalltype() {
		return functionhalltype;
	}

	public void setFunctionhalltype(String functionhalltype) {
		this.functionhalltype = functionhalltype;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	public int getMaximumguest() {
		return maximumguest;
	}

	public void setMaximumguest(int maximumguest) {
		this.maximumguest = maximumguest;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getCorrelationid() {
		return correlationid;
	}

	public void setCorrelationid(String correlationid) {
		this.correlationid = correlationid;
	}

	private String city;
	private int zipcode;
	private String functionhallContactNumber;

	public String getOwnerContactNumber() {
		return ownerContactNumber;
	}

	public void setOwnerContactNumber(String ownerContactNumber) {
		this.ownerContactNumber = ownerContactNumber;
	}

	public String getFunctionhallContactNumber() {
		return functionhallContactNumber;
	}

	public void setFunctionhallContactNumber(String functionhallContactNumber) {
		this.functionhallContactNumber = functionhallContactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String[] getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String[] imageUrl) {
		ImageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "FunctionHallUIResponse [name=" + name + ", ownerFirstName=" + ownerFirstName + ", ownerLastName="
				+ ownerLastName + ", ownerId=" + ownerId + ", functionhalldescription=" + functionhalldescription
				+ ", functionhalltype=" + functionhalltype + ", foodtype=" + foodtype + ", maximumguest=" + maximumguest
				+ ", roomtype=" + roomtype + ", ownerContactNumber=" + ownerContactNumber + ", ImageUrl="
				+ Arrays.toString(ImageUrl) + ", street=" + street + ", state=" + state + ", parking=" + parking
				+ ", internet=" + internet + ", nosmoking=" + nosmoking + ", airconditioning=" + airconditioning
				+ ", soundsystem=" + soundsystem + ", lightingsystem=" + lightingsystem + ", dancefloor=" + dancefloor
				+ ", noalcohol=" + noalcohol + ", banquethall=" + banquethall + ", partyroom=" + partyroom
				+ ", conference=" + conference + ", performance=" + performance + ", weddinghall=" + weddinghall + ", nightclub="
				+ nightclub + ",eventspace=" + eventspace + ", correlationid=" + correlationid + ", city=" + city
				+ ", zipcode=" + zipcode + ", functionhallContactNumber=" + functionhallContactNumber + "]";
	}

}
