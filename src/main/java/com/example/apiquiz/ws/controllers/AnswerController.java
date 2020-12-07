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

import com.example.apiquiz.ws.entities.Answer;
import com.example.apiquiz.ws.entities.Question;
import com.example.apiquiz.ws.services.AnswerService;

@RestController
@RequestMapping(value = "answerws")
public class AnswerController {

	Logger log = Logger.getLogger(AnswerController.class.getName());

	@Autowired
	AnswerService answerService;

	@GetMapping(path = "/{question_id}")
	public ResponseEntity<List<Answer>> getAllAnswerByQuestionById(@PathVariable("question_id") Integer question_id) {
		List<Answer> answers = answerService.getAllAnswerByQuestionId(question_id);
		if (answers != null && answers.size() > 0) {
			return new ResponseEntity<>(answers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(answers, HttpStatus.NO_CONTENT);
		}
	}
}
