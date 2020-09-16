package com.vedika.functionhall.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.data.annotation.Id;

public class FunctionHall {
	@Id
	private String id;
	private String name;
	private String ownerId;
	private String ownerFirstName;
	private String ownerLastName;
	private String functionhalldescription;
	private String functionhalltype;
	private String foodtype;
	private int maximumguest;
	private String roomtype;
	private String functionhallContactNumber;
	private String streetAddress;
	private String state;
	private String country;
	private String city;
	private String zipCode;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	private String email;
	private String[] imageUrl;
	private LocalDate date;
	private LocalTime timeSlot;
	private String Bookedby;
	private String bucketName;
	private String imageDirectoryPath;
	private String correlationid;

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(LocalTime timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getBookedby() {
		return Bookedby;
	}

	public void setBookedby(String bookedby) {
		Bookedby = bookedby;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	public String[] getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String[] imageUrl) {
		this.imageUrl = imageUrl;
	}

	public FunctionHall() {
	}

	public String getFunctionhallContactNumber() {
		return functionhallContactNumber;
	}

	public void setFunctionhallContactNumber(String functionhallContactNumber) {
		this.functionhallContactNumber = functionhallContactNumber;
	}

	public FunctionHall(String id, String name, String ownerId, String ownerFirstName, String ownerLastName,
			String functionhallContactNumber, String street, String state, String city, String email, String bucketName,
			String imageDirectoryPath, String imageUrl, String correlationid) {
		super();
		this.id = id;
		this.name = name;
		this.ownerId = ownerId;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.functionhallContactNumber = functionhallContactNumber;
		this.state = state;
		this.email = email;
		this.bucketName = bucketName;
		this.imageDirectoryPath = imageDirectoryPath;

		this.correlationid = correlationid;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getImageDirectoryPath() {
		return imageDirectoryPath;
	}

	public void setImageDirectoryPath(String imageDirectoryPath) {
		this.imageDirectoryPath = imageDirectoryPath;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCorrelationid() {
		return correlationid;
	}

	public void setCorrelationid(String correlationid) {
		this.correlationid = correlationid;
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

	@Override
	public String toString() {
		return "FunctionHall [id=" + id + ", name=" + name + ", ownerId=" + ownerId + ", ownerFirstName="
				+ ownerFirstName + ", ownerLastName=" + ownerLastName + ", functionhalldescription="
				+ functionhalldescription + ", functionhalltype=" + functionhalltype + ", foodtype=" + foodtype
				+ ", maximumguest=" + maximumguest + ", roomtype=" + roomtype + ", functionhallContactNumber="
				+ functionhallContactNumber + ", streetAddress=" + streetAddress + ", state=" + state + ", country="
				+ country + ", city=" + city + ", zipCode=" + zipCode + ", parking=" + parking + ", internet="
				+ internet + ", nosmoking=" + nosmoking + ", airconditioning=" + airconditioning + ", soundsystem="
				+ soundsystem + ", lightingsystem=" + lightingsystem + ", dancefloor=" + dancefloor + ", noalcohol="
				+ noalcohol + ", banquethall=" + banquethall + ", partyroom=" + partyroom + ", conference=" + conference
				+ ", performance=" + performance + ", weddinghall=" + weddinghall + ", nightclub=" + nightclub
				+ ", eventspace=" + eventspace + ", email=" + email + ", imageUrl=" + Arrays.toString(imageUrl)
				+ ", date=" + date + ", timeSlot=" + timeSlot + ", Bookedby=" + Bookedby + ", bucketName=" + bucketName
				+ ", imageDirectoryPath=" + imageDirectoryPath + ", correlationid=" + correlationid + "]";
	}

}