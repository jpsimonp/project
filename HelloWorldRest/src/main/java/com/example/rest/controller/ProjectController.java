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
 * PROJECT
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
	
	@GetMapping(value = "/evolution01", produces = "application/json")
	@ResponseBody
	public ProjectData evolution01(@RequestParam(value="name", defaultValue="ProjectData") String data) {
		return new ProjectData(data);
	}
	
	@GetMapping(value = "/evolution02", produces = "application/json")
	@ResponseBody
	public ProjectData evolution02(@RequestParam(value="name", defaultValue="ProjectData") String data) {
		return new ProjectData(data);
	}
}
