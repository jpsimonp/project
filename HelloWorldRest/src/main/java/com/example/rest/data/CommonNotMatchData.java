package com.example.rest.data;

/**
 * 
 * @author jpsimon
 * 
 * PROJECT
 * 
 * Greeting data class is shared in project and product but new field remarks was added on project
 *
 */
public class CommonNotMatchData {

    private final long id;
    private final String content;
    private final String remarks;

    public CommonNotMatchData(long id, String content, String remarks) {
        this.id = id;
        this.content = content;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public String getRemarks() {
		return remarks;
	}
}
