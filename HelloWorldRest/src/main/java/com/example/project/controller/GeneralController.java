package com.example.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

	@RequestMapping(value = "/general", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String general() {
		return "General";
	}
}
