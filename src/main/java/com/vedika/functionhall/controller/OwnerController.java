package com.vedika.functionhall.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.model.FunctionHall;
import com.vedika.functionhall.model.FunctionHallUIResponse;
import com.vedika.functionhall.model.GenericResponse;
import com.vedika.functionhall.model.Owner;
import com.vedika.functionhall.service.OwnerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class OwnerController {
	Logger logger = LoggerFactory.getLogger(OwnerController.class);

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "/functionhalls", method = RequestMethod.GET)
	public ResponseEntity<GenericResponse<List<FunctionHallUIResponse>>> findFunctionhallByNameAndCity(
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "timeslot", required = false) String timeslot,
			@RequestParam(value = "Date", required = false) String date,
			@RequestParam(value = "maximumguest", required = false) int maximumguest) {
// ToDo: add a log statement
//ToDo: add a request timeSlot
		logger.info("find by name:" + name);
		logger.info("find by city:" + city);
		logger.info("findby maximumguest:" + maximumguest);

		List<Owner> functionhallOwners = ownerService.findFunctionHallByNameAndCity(city, name, maximumguest);

		List<FunctionHallUIResponse> functionhallsUI = new ArrayList<FunctionHallUIResponse>();

		if (null != functionhallOwners && !functionhallOwners.isEmpty()) {
			for (Owner owner : functionhallOwners) {

				List<FunctionHall> funtionhalls = owner.getFunctionhall();

				if (null != funtionhalls && !funtionhalls.isEmpty()) {

					for (FunctionHall functionHall : funtionhalls) {

						FunctionHallUIResponse response = new FunctionHallUIResponse();
						response.setName(functionHall.getName());
						response.setOwnerFirstName(owner.getFirstName());
						response.setOwnerLastName(owner.getLastName());
						response.setOwnerId(owner.getOwnerId());
						response.setCity(functionHall.getCity());
						response.setStreet(functionHall.getStreetAddress());
						response.setFunctionhalldescription(functionHall.getFunctionhalldescription());
						response.setFunctionhalltype(functionHall.getFunctionhalltype());
						response.setMaximumguest(functionHall.getMaximumguest());
						response.setFoodtype(functionHall.getFoodtype());
						response.setRoomtype(functionHall.getRoomtype());
						response.setState(functionHall.getState());
						response.setImageUrl(functionHall.getImageUrl());
						response.setCorrelationid(functionHall.getCorrelationid());
						response.setFunctionhallContactNumber(functionHall.getFunctionhallContactNumber());
						response.setOwnerContactNumber(owner.getOwnerContactNumber());
						
						response.setAirconditioning(functionHall.getAirconditioning());
						response.setBanquethall(functionHall.getBanquethall());
						response.setDancefloor(functionHall.getDancefloor());
						response.setEventspace(functionHall.getEventspace());
						response.setInternet(functionHall.getInternet());
						response.setLightingsystem(functionHall.getLightingsystem());
						response.setNightclub(functionHall.getNightclub());
						response.setNoalcohol(functionHall.getNoalcohol());
						response.setNosmoking(functionHall.getNosmoking());
						response.setPartyroom(functionHall.getPartyroom());
						response.setParking(functionHall.getParking());
						response.setSoundsystem(functionHall.getSoundsystem());
						response.setWeddinghall(functionHall.getWeddinghall());
						response.setConference(functionHall.getConference());
						response.setPerformance(functionHall.getPerformance());
						
						functionhallsUI.add(response);
					}
				}
			}

		}

		GenericResponse<List<FunctionHallUIResponse>> response = new GenericResponse<List<FunctionHallUIResponse>>();
		response.setData(functionhallsUI);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	// @RequestMapping(value="/updatefunctionhall" ,method=RequesMethod.PUT)
	
	@RequestMapping(value = "/owner", method = RequestMethod.GET)
	public ResponseEntity<GenericResponse<List<FunctionHallUIResponse>>> findFunctionhallByNameAndCity(
			@RequestParam(value = "ownerId", required = false) String _id){
		
		List<Owner> functionhallOwners = ownerService.findByownerID(_id);

		List<FunctionHallUIResponse> functionhallsUI = new ArrayList<FunctionHallUIResponse>();

		if (null != functionhallOwners && !functionhallOwners.isEmpty()) {
			for (Owner owner : functionhallOwners) {

				List<FunctionHall> funtionhalls = owner.getFunctionhall();

				if (null != funtionhalls && !funtionhalls.isEmpty()) {

					for (FunctionHall functionHall : funtionhalls) {
           
						FunctionHallUIResponse response = new FunctionHallUIResponse();
						response.setName(functionHall.getName());
						response.setOwnerFirstName(owner.getFirstName());
						response.setOwnerLastName(owner.getLastName());
						response.setOwnerId(owner.getOwnerId());
						response.setCity(functionHall.getCity());
						response.setStreet(functionHall.getStreetAddress());
						response.setFunctionhalldescription(functionHall.getFunctionhalldescription());
						response.setFunctionhalltype(functionHall.getFunctionhalltype());
						response.setMaximumguest(functionHall.getMaximumguest());
						response.setFoodtype(functionHall.getFoodtype());
						response.setRoomtype(functionHall.getRoomtype());
						response.setState(functionHall.getState());
						response.setImageUrl(functionHall.getImageUrl());
						response.setCorrelationid(functionHall.getCorrelationid());
						response.setFunctionhallContactNumber(functionHall.getFunctionhallContactNumber());
						response.setOwnerContactNumber(owner.getOwnerContactNumber());
						functionhallsUI.add(response);
					}
				}
			}

		}

		GenericResponse<List<FunctionHallUIResponse>> response = new GenericResponse<List<FunctionHallUIResponse>>();
		response.setData(functionhallsUI);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
				
		
	
}
