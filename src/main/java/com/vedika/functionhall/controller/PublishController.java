package com.vedika.functionhall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.model.GenericResponse;
import com.vedika.functionhall.model.Owner;
import com.vedika.functionhall.model.PublishDetails;
import com.vedika.functionhall.model.Response;
import com.vedika.functionhall.service.PublishService;

@RestController
@RequestMapping("/api")
public class PublishController {

	@Autowired
	private PublishService publishService;

	@PostMapping(value = "/publishListing")
	public ResponseEntity<GenericResponse<Response>> saveOrUpdatePublishDetails(
			@RequestBody PublishDetails publishDetails, Owner owner) {

		publishService.saveOrUpdatepublishListing(publishDetails, owner);
		Response response = new Response();
		response.setMsg("functionhall details added successfully.");
		GenericResponse<Response> responsedata = new GenericResponse<Response>();
		responsedata.setData(response);
		return new ResponseEntity<GenericResponse<Response>>(responsedata, HttpStatus.OK);
	}
}
