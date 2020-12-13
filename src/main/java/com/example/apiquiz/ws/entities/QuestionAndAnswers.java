package com.example.apiquiz.ws.entities;

import java.util.List;

public class QuestionAndAnswers {

	String question;
	Answers[] answers;
	
	public QuestionAndAnswers(String question, Answers[] answers){
		this.question= question;
		this.answers= answers;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answers[] getAnswers() {
		return answers;
	}

	public void setAnswers(Answers[] answers) {
		this.answers = answers;
	}
	
}
