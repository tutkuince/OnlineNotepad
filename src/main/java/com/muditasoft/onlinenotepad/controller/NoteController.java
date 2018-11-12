package com.muditasoft.onlinenotepad.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.muditasoft.onlinenotepad.model.Note;
import com.muditasoft.onlinenotepad.service.NoteService;

@Controller
@RequestMapping("/notes")
public class NoteController {

	@Autowired
	private NoteService noteService;

	@GetMapping("/")
	public String getNoteList(Model model, HttpServletRequest request) {
		List<Note> noteList = noteService.getAllNote();
		
		model.addAttribute("user", request.getSession().getAttribute("user"));
		model.addAttribute("noteList", noteList);

		return "index";
	}

	@GetMapping("/details")
	public String getDetails(@RequestParam("noteId") Long id, Model model) {
		// get note where noteId equals to id
		Note note = noteService.getNoteById(id);

		// set note as a model attribute
		model.addAttribute("note", note);
		return "details";
	}

	@GetMapping("/showAddNoteForm")
	public String addNote(Model model) {
		Note note = new Note();

		model.addAttribute("note", note);
		return "addNote";
	}

	@PostMapping("/saveNote")
	public String saveNote(@ModelAttribute("note") Note note) {
		noteService.save(note);
		return "redirect:/notes/";
	}

	@PostMapping("/updateNote")
	public String updateNote(@ModelAttribute("note") Note note) {
		noteService.save(note);
		return "redirect:/notes/";
	}

	@GetMapping("/deleteNote")
	public String deleteNote(@RequestParam("noteId") Long id) {
		// get selected note
		Note note = noteService.getNoteById(id);

		// delete the note
		noteService.delete(note);

		return "redirect:/notes/";
	}
}
