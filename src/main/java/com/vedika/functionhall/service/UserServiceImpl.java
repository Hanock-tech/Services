package com.vedika.functionhall.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mongodb.MongoWriteException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.vedika.functionhall.model.ResponseObject;
import com.vedika.functionhall.model.User;
import com.vedika.functionhall.model.UserLogin;
import com.vedika.functionhall.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MongoTemplate mongoTemplate;
	// @Autowired
	// private SecurityServcie securityservice;

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public String findUserByMobilenumber(User user) throws MongoWriteException {

		String msg = "user already register";
		String msg2 = "registrationsuccess";
		try {
			if (user != null) {
				Query query = new Query();
				query.addCriteria(Criteria.where("mobileNumber").is(user.getMobileNumber()));
				User userdata = mongoTemplate.findOne(query, User.class);
				System.out.println(userdata);

				if (user.getMobileNumber().equals(userdata.getMobileNumber())) {

					return msg;
				}
			}
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		} catch (MongoWriteException ex) {
			System.out.println("Entered values is already Exits in database" + ex);
		}
		userRepository.save(user);

		return msg2;

	}

}
