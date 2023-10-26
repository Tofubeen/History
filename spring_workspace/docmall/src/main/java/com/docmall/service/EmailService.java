package com.docmall.service;

import org.springframework.stereotype.Service;

import com.docmall.dto.EmailDTO;

@Service
public interface EmailService {

	void sendMail(EmailDTO dto, String message);

}
