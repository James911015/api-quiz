package com.example.apiquiz.ws.entities;

import java.util.List;

public class CategoryJson {

	String category;
	List<QuestionAndAnswers> questionAndAnswers;
	
	
	public CategoryJson(List<QuestionAndAnswers> questionAndAnswers){
		this.category = "category";
		this.questionAndAnswers= questionAndAnswers;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String description) {
		this.category = description;
	}

	public List<QuestionAndAnswers> getQuestionAndAnswers() {
		return questionAndAnswers;
	}

	public void setQuestionAndAnswers(List<QuestionAndAnswers> questionAndAnswers) {
		this.questionAndAnswers = questionAndAnswers;
	}

}
