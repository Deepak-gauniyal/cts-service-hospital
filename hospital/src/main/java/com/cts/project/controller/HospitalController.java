package com.cts.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
	
	@GetMapping("/greeting")
	public String Greeting() {
		return "Helllo Everyone !!!";
	}

}
