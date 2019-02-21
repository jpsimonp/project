package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jpsimon
 * 
 * PROJECT
 * 
 * General controller class is shared in project and product and it is the same in both
 *
 */
@RestController
public class CommonMatchController {
	
	@GetMapping(value = "/general", produces = "application/json")
	@ResponseBody
	public String general() {
		return "General";
	}
}
