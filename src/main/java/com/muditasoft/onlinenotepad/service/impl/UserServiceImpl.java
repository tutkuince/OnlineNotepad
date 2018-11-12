package com.muditasoft.onlinenotepad.service.impl;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muditasoft.onlinenotepad.dao.UserDao;
import com.muditasoft.onlinenotepad.model.User;
import com.muditasoft.onlinenotepad.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void save(User user) {
		user.setKeyCode(keyGenerator());
		userDao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public User getUserById(Long id) {
		return userDao.getUserById(id);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public String keyGenerator() {
		return UUID.randomUUID().toString();
	}

}
