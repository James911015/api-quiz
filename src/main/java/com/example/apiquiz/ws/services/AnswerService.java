package com.example.apiquiz.ws.services;

import java.util.List;

import com.example.apiquiz.ws.entities.Answer;

public interface AnswerService {
	
	List<Answer> getAllAnswerByQuestionId(Integer question_id);
	
	Answer createAnswer(Answer answer);

}
