package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class TestControler {

//	@RequestMapping("/test",)
	@GetMapping("/test")
	public String firstHandler() {
		return "Just for testing!";

	}

//	@RequestMapping("/home")
	@GetMapping("/home")
	public String home() {
		System.out.println("Home Page");
		return "home";

	}

}
