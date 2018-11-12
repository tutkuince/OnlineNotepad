package com.muditasoft.onlinenotepad.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.muditasoft.onlinenotepad.dao.NoteDao;
import com.muditasoft.onlinenotepad.model.Note;

@Component
public class NoteDaoImpl implements NoteDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Note note) {
		sessionFactory.getCurrentSession().saveOrUpdate(note);
	}

	@Override
	public void delete(Note note) {
		sessionFactory.getCurrentSession().delete(note);
	}

	@Override
	public List<Note> getAllNote() {
		Session session = sessionFactory.getCurrentSession();

		Query<Note> query = session.createQuery("from Note", Note.class);
		return query.getResultList();
	}

	@Override
	public Note getNoteById(Long id) {
		return sessionFactory.getCurrentSession().get(Note.class, id);
	}

	@Override
	public List<Note> getNotesByUser(Long userId) {
		Query<Note> query = sessionFactory.getCurrentSession().createQuery("from Note where user_id=:userId", Note.class);
		query.setParameter("userId", userId);
		return query.getResultList();
	}

}
