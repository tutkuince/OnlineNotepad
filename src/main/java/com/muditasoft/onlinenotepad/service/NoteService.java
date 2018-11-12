package com.muditasoft.onlinenotepad.service;

import java.util.List;

import com.muditasoft.onlinenotepad.model.Note;
import com.muditasoft.onlinenotepad.model.User;

public interface NoteService {
	void save(Note note);
	void delete(Note note);
	List<Note> getAllNote();
	Note getNoteById(Long id);
	List<Note> getNotesByUser(User user);
}
