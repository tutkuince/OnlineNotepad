package com.muditasoft.onlinenotepad.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muditasoft.onlinenotepad.dao.NoteDao;
import com.muditasoft.onlinenotepad.model.Note;
import com.muditasoft.onlinenotepad.model.User;
import com.muditasoft.onlinenotepad.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteDao noteDao;
	
	@Override
	@Transactional
	public void save(Note note) {
		noteDao.save(note);
	}

	@Override
	@Transactional
	public void delete(Note note) {
		noteDao.delete(note);
	}

	@Override
	@Transactional
	public List<Note> getAllNote() {
		return noteDao.getAllNote();
	}

	@Override
	@Transactional
	public Note getNoteById(Long id) {
		return noteDao.getNoteById(id);
	}

	@Override
	@Transactional
	public List<Note> getNotesByUser(User user) {
		return noteDao.getNotesByUser(user.getId());
	}

}
