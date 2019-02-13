package com.example.project.data;

public class Greeting {

    private final long id;
    private final String content;
    private final String remarks;

    public Greeting(long id, String content, String remarks) {
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
