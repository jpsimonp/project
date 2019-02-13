package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.data.ProjectData;

/**
 * 
 * @author jpsimon
 * 
 * Project controller class is just in project
 *
 */
@RestController
public class ProjectController {
	
	@GetMapping(value = "/project", produces = "application/json")
	@ResponseBody
	public ProjectData project(@RequestParam(value="name", defaultValue="ProjectData") String data) {
		return new ProjectData(data);
	}
}
