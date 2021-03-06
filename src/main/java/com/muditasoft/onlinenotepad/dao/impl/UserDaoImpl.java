package com.muditasoft.onlinenotepad.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.muditasoft.onlinenotepad.dao.UserDao;
import com.muditasoft.onlinenotepad.model.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public List<User> getAllUser() {
		Session session = sessionFactory.getCurrentSession();

		Query<User> query = session.createQuery("from User", User.class);
		return query.getResultList();
	}

	@Override
	public User getUserById(Long id) {
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public User getUserByKeyCode(String keyCode) {
		Query<User> query = sessionFactory.getCurrentSession().createQuery("from User where keyCode=:keyCode", User.class);
		query.setParameter("keyCode", keyCode);
		return query.getSingleResult();
	}

	@Override
	public User getUserByUsernameAndPass(String userName, String password) {
		Query<User> query = sessionFactory.getCurrentSession().createQuery("from User where userName=:userName and password=:password", User.class);
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		return query.uniqueResult();	// for null values
	}

}
