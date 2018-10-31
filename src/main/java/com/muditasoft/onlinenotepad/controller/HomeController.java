package com.muditasoft.onlinenotepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.muditasoft.onlinenotepad.model.Note;
import com.muditasoft.onlinenotepad.service.NoteService;

@Controller
public class HomeController {

	@Autowired
	private NoteService noteService;
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/details")
	public String getDetails() {
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
		return "redirect:/";	
	}
}
