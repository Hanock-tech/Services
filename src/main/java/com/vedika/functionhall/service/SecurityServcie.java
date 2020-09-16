package com.vedika.functionhall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vedika.functionhall.model.Owner;

@Service
public interface SecurityServcie {
	List<Owner> sendOTP(String mobileNumber);

	boolean send2FaCode(String mobileNumber, String twoFaCode);
}
