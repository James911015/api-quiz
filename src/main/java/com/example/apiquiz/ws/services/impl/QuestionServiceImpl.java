package com.example.apiquiz.ws.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiquiz.ws.entities.Question;
import com.example.apiquiz.ws.repository.QuestionRepository;
import com.example.apiquiz.ws.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;

	public List<Question> getAllQuestionByCategory(Integer category_id) {
		// TODO Auto-generated method stub
		return questionRepository.getAllQuestionByCategory(category_id);
	}

	public Question createQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

}
