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
	
	@GetMapping(value = "/general/evolution1/product-project", produces = "application/json")
	@ResponseBody
	public String evolution1() {
		return "General evolution1 product-project";
	}
	
	@GetMapping(value = "/general/evolution2/product-project", produces = "application/json")
	@ResponseBody
	public String evolution2() {
		return "General evolution2 product-project";
	}
}
