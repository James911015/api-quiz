package com.example.apiquiz.ws.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiquiz.ws.entities.Answer;
import com.example.apiquiz.ws.repository.AnswerRepository;
import com.example.apiquiz.ws.services.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	AnswerRepository answerRepository;
	
	public List<Answer> getAllAnswerByQuestionId(Integer question_id) {
		// TODO Auto-generated method stub
		return answerRepository.getAllAnswerByQuestionId(question_id);
	}

	public Answer createAnswer(Answer answer) {
		// TODO Auto-generated method stub
		return answerRepository.save(answer);
	}

}
