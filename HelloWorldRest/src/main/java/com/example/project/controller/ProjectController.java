package com.example.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.data.PorojectData;

@RestController
public class ProjectController {
	
	@RequestMapping(value = "/project", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public PorojectData project(@RequestParam(value="name", defaultValue="ProjectData") String data) {
		return new PorojectData(data);
	}
}
