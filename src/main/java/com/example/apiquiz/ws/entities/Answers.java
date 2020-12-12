package com.example.apiquiz.ws.entities;

public class Answers {

	String answer;
	boolean response;
	
	public Answers(String answer,boolean response){
		this.answer= answer;
		this.response= response;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}	
}
