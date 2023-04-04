package com.Authentication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class HomeController {
	
	//end point
	@GetMapping("/welcome")
	public String Welcome() {
	String	text=" Welcome Page. ";
			text+= " Un registered login are not allowed";
		return text;
		
	}
	//end point
	@GetMapping("/getUsers")
	public String getUser() {
		return"{\"name\":\"Sumana\"}";
	}

}
