package com.muditasoft.onlinenotepad.service;

import java.util.List;

import com.muditasoft.onlinenotepad.model.Note;

public interface NoteService {
	void save(Note note);
	void delete(Note note);
	List<Note> getAllNote();
	Note getNoteById(Long id);
}
