package com.vedika.functionhall.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.vedika.functionhall.model.User;
import com.vedika.functionhall.service.UserService;

@RestController
@RequestMapping("/api")
public class RegisterController {
	private Map<String,User> userdata=new HashMap<>();

	@Autowired
	private UserService userservice;

	@PostMapping(path = "/registerUser")
	public String registerUser(@Valid @RequestBody User user) throws Exception {

		String userExists = userservice.findUserByMobilenumber(user);
		System.out.println(userExists);
		return userExists;
	}
}
