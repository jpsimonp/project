package com.example.rest.data;

import java.util.UUID;

/**
 * 
 * @author jpsimon
 * 
 * PROJECT
 * 
 * Project data class is just in project
 *
 */
public class ProjectData {
	
	private UUID id;
	private String content;
	private String evolution1;
	
	public ProjectData(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEvolution1() {
		return evolution1;
	}

	public void setEvolution1(String evolution1) {
		this.evolution1 = evolution1;
	}

}
