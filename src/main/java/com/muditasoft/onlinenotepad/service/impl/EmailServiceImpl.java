package com.muditasoft.onlinenotepad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.muditasoft.onlinenotepad.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private MailSender mailSender;

	@Override
	public void registerMail(String mail, String key) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("online.notepad.tr@gmail.com");
		message.setTo(mail);
		message.setSubject("Activate your membership");
		message.setText("Click the link for activate your membership on OnlineNotepad\n\n"
				+ "http://localhost:8080/onlinenotepad/reg/" + key);
		mailSender.send(message);
	}

}
