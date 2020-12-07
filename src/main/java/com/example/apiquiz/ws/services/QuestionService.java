package com.example.apiquiz.ws.services;

import java.util.List;

import com.example.apiquiz.ws.entities.Question;

public interface QuestionService {

	List<Question> getAllQuestionByCategory(Integer category_id);
	
	Question createQuestion(Question question);
	
	
}
