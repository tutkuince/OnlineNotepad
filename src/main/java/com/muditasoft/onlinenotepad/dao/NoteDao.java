package com.muditasoft.onlinenotepad.dao;

import java.util.List;

import com.muditasoft.onlinenotepad.model.Note;

public interface NoteDao {

	// Long save(Note note) provides create and update
	void save(Note note);
	// void update(Note note);
	void delete(Note note);
	List<Note> getAllNote();
	Note getNoteById(Long id);
}
