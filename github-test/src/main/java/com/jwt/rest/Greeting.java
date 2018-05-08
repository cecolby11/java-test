package com.jwt.rest;

public class Greeting {
	private String results;
	
	// note ObjectMapper default configuration is to only access properties that are public fields or have public getters/sestters... 
	public Greeting() {
		this.setResults("Hello World");
	}
	
	public Greeting(String name) {
		this.setResults("Hello " + name + "!");
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}
}
