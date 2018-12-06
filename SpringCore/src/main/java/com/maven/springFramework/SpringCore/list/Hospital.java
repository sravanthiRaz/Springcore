package com.maven.springFramework.SpringCore.list;

import java.util.List;

public class Hospital {
	private String name;
	private List<String> deparments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDeparments() {
		return deparments;
	}

	public void setDeparments(List<String> deparments) {
		this.deparments = deparments;
	}

}
