package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jpsimon
 * 
 * General controller class is shared in project and product and it is the same in both
 *
 */
@RestController
public class GeneralController {

	@RequestMapping(value = "/general", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String general() {
		return "General";
	}
}
