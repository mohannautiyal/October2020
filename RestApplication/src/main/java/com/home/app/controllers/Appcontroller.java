package com.home.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Welcome")
public class Appcontroller{
	
	
	
	@GetMapping(value="/{name}")
	public String welcomeEmp(@PathVariable
			String name) {
		
		return "Welcome " +name;
	}

	
	@GetMapping(value="/")
	public String welcomeTest() {
		
		return "Welcome Home " ;
	}
}
