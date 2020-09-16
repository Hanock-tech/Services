package com.vedika.functionhall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import com.vedika.functionhall.model.Owner;
import com.vedika.functionhall.repository.OwnerRepository;
/*
@Service("twilio")
public class SecurityServiceImp implements SecurityServcie {
	private final TwilioConfiguration twilioConfiguration;
	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	public SecurityServiceImp(TwilioConfiguration twilioConfiguration) {
		this.twilioConfiguration = twilioConfiguration;
	}

	public boolean send2FaCode(String mobileNumber, String twoFaCode) {

		Message.creator(new PhoneNumber(mobileNumber), new PhoneNumber(twilioConfiguration.getTrialNumber()),
				"Your Two Factor Authentication code is: " + twoFaCode).create();

		return true;

	}

	@Override
	public List<Owner> sendOTP(String mobileNumber) {
		return ownerRepository.sendOTP(mobileNumber);
	}

}*/
