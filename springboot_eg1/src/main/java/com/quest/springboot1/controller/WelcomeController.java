package com.quest.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WelcomeController {
	
//	@RequestMapping(path="/welcome",method=RequestMethod.GET)
//	public String getWelcomePage() {
//		return "welcome.jsp";

	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to Spring Boot";
	}
	
//	@RequestMapping("/")
//    public String msg() {
//        return "index.html";
//		
//	}

}
