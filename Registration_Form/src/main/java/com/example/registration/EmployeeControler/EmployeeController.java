package com.example.registration.EmployeeControler;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

	
	@PostMapping(path= "/save")
	public String saveEmployee() {
		return null;
		
	}
	
}
