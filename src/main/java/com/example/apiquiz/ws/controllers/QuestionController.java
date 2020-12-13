package com.example.apiquiz.ws.controllers;



import java.util.ArrayList;
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
import com.example.apiquiz.ws.entities.Answers;
import com.example.apiquiz.ws.entities.CategoryJson;
import com.example.apiquiz.ws.entities.Question;
import com.example.apiquiz.ws.entities.QuestionAndAnswers;
import com.example.apiquiz.ws.services.QuestionService;

@RestController
@RequestMapping(value = "questionws")
public class QuestionController {

	Logger log = Logger.getLogger(UserController.class.getName());

	@Autowired
	QuestionService questionService;

	@GetMapping(path = "/{category_id}")
	public ResponseEntity<List<Question>> getAllQuestionByCategory(@PathVariable("category_id") Integer category_id) {
		List<Question> questions = questionService.getAllQuestionByCategory(category_id);
		if (questions != null && questions.size() > 0) {
			return new ResponseEntity<>(questions, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(questions, HttpStatus.NO_CONTENT);
		}
	}
	


	@GetMapping(path = "/questions")
	public ResponseEntity<List<CategoryJson>> getAllQuestion() {
		
		Answers[] list_en_answers_1= new Answers[4];
		list_en_answers_1[0]= new Answers("answer1",true);
		list_en_answers_1[1]= new Answers("answer2",false);
		list_en_answers_1[2]= new Answers("answer3",false);
		list_en_answers_1[3]= new Answers("answer4",false);
		
		QuestionAndAnswers en_1= new QuestionAndAnswers("Pregunta1",list_en_answers_1);
		
		Answers en_2_1= new Answers("answer2",true);
		Answers en_2_2= new Answers("answer2",false);
		Answers en_2_3= new Answers("answer2",false);
		Answers en_2_4= new Answers("answer2",false);
		Answers[] list_en_answers_2= new Answers[4];
		list_en_answers_2[0]=en_2_1;
		list_en_answers_2[1]=en_2_2;
		list_en_answers_2[2]=en_2_3;
		list_en_answers_2[3]=en_2_4;
		QuestionAndAnswers en_2= new QuestionAndAnswers("Pregunta2",list_en_answers_2);
		
		
		ArrayList<QuestionAndAnswers> list_en_questions= new ArrayList<>();
		list_en_questions.add(en_1);
		list_en_questions.add(en_2);
		
		CategoryJson CategoryEnglish = new CategoryJson("english",list_en_questions);
		
		//------------------------------------------------------------------------------
		Answers[] list_sc_answers_1= new Answers[4];
		list_sc_answers_1[0]= new Answers("answer1",true);
		list_sc_answers_1[1]= new Answers("answer2",false);
		list_sc_answers_1[2]= new Answers("answer3",false);
		list_sc_answers_1[3]= new Answers("answer4",false);
		
		QuestionAndAnswers sc_1= new QuestionAndAnswers("Pregunta1",list_sc_answers_1);
		
		Answers sc_2_1= new Answers("answer2",true);
		Answers sc_2_2= new Answers("answer2",false);
		Answers sc_2_3= new Answers("answer2",false);
		Answers sc_2_4= new Answers("answer2",false);
		Answers[] list_sc_answers_2= new Answers[4];
		list_sc_answers_2[0]=sc_2_1;
		list_sc_answers_2[1]=sc_2_2;
		list_sc_answers_2[2]=sc_2_3;
		list_sc_answers_2[3]=sc_2_4;
		QuestionAndAnswers sc_2= new QuestionAndAnswers("Pregunta2",list_sc_answers_2);
		
		
		ArrayList<QuestionAndAnswers> list_sc_questions= new ArrayList<>();
		list_sc_questions.add(sc_1);
		list_sc_questions.add(sc_2);
		
		CategoryJson CategoryScience = new CategoryJson("science",list_sc_questions);
		
		List<CategoryJson> categoryJsons= new ArrayList<>();
		categoryJsons.add(CategoryEnglish);
		categoryJsons.add(CategoryScience);
		
		return new ResponseEntity<>(categoryJsons, HttpStatus.OK);
	}

}
