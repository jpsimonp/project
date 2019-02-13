package com.example.rest.data;

import java.util.UUID;

/**
 * 
 * @author jpsimon
 * 
 * Project data class is just in project
 *
 */
public class ProjectData {
	
	private UUID id;
	private String content;
	
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

}
