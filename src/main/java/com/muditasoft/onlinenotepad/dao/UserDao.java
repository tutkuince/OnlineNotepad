package com.muditasoft.onlinenotepad.dao;

import java.util.List;

import com.muditasoft.onlinenotepad.model.User;

public interface UserDao {
	// void save(User user) provides create and updates
	void save(User user);
	List<User> getAllUser();
	User getUserById(Long id);
	void delete(User user);
}
