package com.javatechie.email.api.dto;

import lombok.Data;

@Data
public class MailRequest {
	
	private String name;
	private String to = "akram.rq.645@gmail.com";
	private String from;
	private String subject;

}
