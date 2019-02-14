package com.example.rest.data;

/**
 * 
 * @author jpsimon
 * 
 * PROJECT
 * 
 * Common data class is shared in project and product and it is the same in both
 *
 */
public class CommonMatchData {
	
	private String evolution1;

	public CommonMatchData(String e) {
		this.evolution1 = e;
	}


	public String getEvolution1() {
		return evolution1;
	}

	public void setEvolution1(String evolution1) {
		this.evolution1 = evolution1;
	}

}
