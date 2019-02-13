package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/project", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ProjectData project(@RequestParam(value="name", defaultValue="ProjectData") String data) {
		return new ProjectData(data);
	}
}
