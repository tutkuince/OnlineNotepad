package com.muditasoft.onlinenotepad.service;

import java.util.List;

import com.muditasoft.onlinenotepad.model.User;

public interface UserService {
	void save(User user);
	List<User> getAllUser();
	User getUserById(Long id);
	void delete(User user);
	String keyGenerator();
}
