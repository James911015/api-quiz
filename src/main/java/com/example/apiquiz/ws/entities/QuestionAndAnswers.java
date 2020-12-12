package com.example.apiquiz.ws.entities;

import java.util.List;

public class QuestionAndAnswers {

	String question;
	List<Answers> answers;
	
	public QuestionAndAnswers(String question, List<Answers> answers){
		this.question= question;
		this.answers= answers;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
}
