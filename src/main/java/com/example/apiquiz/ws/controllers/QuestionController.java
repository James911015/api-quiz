package com.example.apiquiz.ws.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiquiz.ws.entities.Question;
import com.example.apiquiz.ws.services.QuestionService;

@RestController
@RequestMapping(value = "questionws")
public class QuestionController {

	Logger log = Logger.getLogger(UserController.class.getName());

	@Autowired
	QuestionService questionService;

	@GetMapping(path = "/{category_id}")
	public ResponseEntity<List<Question>> getAllQuestionByCategory(@PathVariable("category_id") Integer category_id) {
		List<Question> questions=questionService.getAllQuestionByCategory(category_id);
		if(questions !=null && questions.size()>0){
			return new ResponseEntity<>(questions, HttpStatus.OK);
		}else{
			return new ResponseEntity<>(questions, HttpStatus.NO_CONTENT);
		}
	}

}
