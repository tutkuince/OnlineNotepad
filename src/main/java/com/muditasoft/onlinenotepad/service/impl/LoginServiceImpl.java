package com.muditasoft.onlinenotepad.service.impl;

import org.springframework.stereotype.Service;

import com.muditasoft.onlinenotepad.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isValid(String pass1, String pass2) {
		return pass1.equals(pass2) ? true : false;
	}

}
