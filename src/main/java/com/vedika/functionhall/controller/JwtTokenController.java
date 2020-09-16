package com.vedika.functionhall.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.model.JwtResponse;
import com.vedika.functionhall.model.User;
import com.vedika.functionhall.tokenservice.JwtTokenUtil;
/*
@RestController
public class JwtTokenController {
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody User authenticationRequest) throws Exception {

		final String token = jwtTokenUtil.generateToken(authenticationRequest);
		final Date Expirationtime = jwtTokenUtil.getExpirationDateFromToken(token);

		return ResponseEntity.ok(new JwtResponse(token, Expirationtime));
	}

	@RequestMapping(value = "/contril", method = RequestMethod.GET)
	public String meethod() {
		return "hello";
	}
} */


