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
	public ResponseEntity<CategoryJson> getAllQuestion() {
		
		Answers en_1_1= new Answers("answer1",true);
		Answers en_1_2= new Answers("answer1",false);
		Answers en_1_3= new Answers("answer1",false);
		Answers en_1_4= new Answers("answer1",false);
		List<Answers> list_en_answers_1= new ArrayList<>();
		list_en_answers_1.add(en_1_1);
		list_en_answers_1.add(en_1_2);
		list_en_answers_1.add(en_1_3);
		list_en_answers_1.add(en_1_4);
		QuestionAndAnswers en_1= new QuestionAndAnswers("Pregunta1",list_en_answers_1);
		
		Answers en_2_1= new Answers("answer2",true);
		Answers en_2_2= new Answers("answer2",false);
		Answers en_2_3= new Answers("answer2",false);
		Answers en_2_4= new Answers("answer2",false);
		List<Answers> list_en_answers_2= new ArrayList<>();
		list_en_answers_2.add(en_2_1);
		list_en_answers_2.add(en_2_2);
		list_en_answers_2.add(en_2_3);
		list_en_answers_2.add(en_2_4);
		QuestionAndAnswers en_2= new QuestionAndAnswers("Pregunta2",list_en_answers_2);
		
		
		List<QuestionAndAnswers> list_en_questions= new ArrayList<>();
		list_en_questions.add(en_1);
		list_en_questions.add(en_2);
		//listQuestionAndAnswers.add(questionAndAnswers2);
		
		CategoryJson CategoryJson = new CategoryJson(list_en_questions);
		
		return new ResponseEntity<>(CategoryJson, HttpStatus.OK);
		//JSONObject jsonObject = null;
		/*String questions = ""
				+ "{'english': [{'question': 'Question 1','answers': [ {'answer': 'Answer 1-1', 'response': true},{'answer': 'Answer 1-2', 'response': false},{'answer': 'Answer 1-3', 'response': false},{'answer': 'Answer 1-4', 'response': false},]},{'question': 'Question 2','answers': [{'answer': 'Answer 2-1', 'response': false},{'answer': 'Answer 2-2', 'response': true},{'answer': 'Answer 2-3', 'response': false},{'answer': 'Answer 2-4', 'response': false},]},{'question': 'Question 3','answers': [{'answer': 'Answer 3-1', 'response': false},{'answer': 'Answer 3-2', 'response': false},{'answer': 'Answer 3-3', 'response': true},{'answer': 'Answer 3-4', 'response': false},]},{'question': 'Question 4','answers': [{'answer': 'Answer 4-1', 'response': false},{'answer': 'Answer 4-2', 'response': false},{'answer': 'Answer 4-3', 'response': false},{'answer': 'Answer 4-4', 'response': true},]},{'question': 'Question 5','answers': [{'answer': 'Answer 5-1', 'response': true},{'answer': 'Answer 5-2', 'response': false},{'answer': 'Answer 5-3', 'response': false},{'answer': 'Answer 5-4', 'response': false},]}]},"
				+ "{'science': [{'question': 'Question 1','answers': [{'answer': 'Answer 1-1', 'response': true},{'answer': 'Answer 1-2', 'response': false},{'answer': 'Answer 1-3', 'response': false},{'answer': 'Answer 1-4', 'response': false},]},{'question': 'Question 2','answers': [{'answer': 'Answer 2-1', 'response': false},{'answer': 'Answer 2-2', 'response': true},{'answer': 'Answer 2-3', 'response': false},{'answer': 'Answer 2-4', 'response': false},]},{'question': 'Question 3','answers': [{'answer': 'Answer 3-1', 'response': false},{'answer': 'Answer 3-2', 'response': false},{'answer': 'Answer 3-3', 'response': true},{'answer': 'Answer 3-4', 'response': false},]},{'question': 'Question 4','answers': [{'answer': 'Answer 4-1', 'response': false},{'answer': 'Answer 4-2', 'response': false},{'answer': 'Answer 4-3', 'response': false},{'answer': 'Answer 4-4', 'response': true},]},{'question': 'Question 5','answers': [{'answer': 'Answer 5-1', 'response': true},{'answer': 'Answer 5-2', 'response': false},{'answer': 'Answer 5-3', 'response': false},{'answer': 'Answer 5-4', 'response': false},]}]},"
				+ "{'spanish': [{'question': 'Question 1','answers': [{'answer': 'Answer 1-1', 'response': true},{'answer': 'Answer 1-2', 'response': false},{'answer': 'Answer 1-3', 'response': false},{'answer': 'Answer 1-4', 'response': false},]},{'question': 'Question 2','answers': [{'answer': 'Answer 2-1', 'response': false},{'answer': 'Answer 2-2', 'response': true},{'answer': 'Answer 2-3', 'response': false},{'answer': 'Answer 2-4', 'response': false},]},{'question': 'Question 3','answers': [{'answer': 'Answer 3-1', 'response': false},{'answer': 'Answer 3-2', 'response': false},{'answer': 'Answer 3-3', 'response': true},{'answer': 'Answer 3-4', 'response': false},]},{'question': 'Question 4','answers': [{'answer': 'Answer 4-1', 'response': false},{'answer': 'Answer 4-2', 'response': false},{'answer': 'Answer 4-3', 'response': false},{'answer': 'Answer 4-4', 'response': true},]},{'question': 'Question 5','answers': [{'answer': 'Answer 5-1', 'response': true},{'answer': 'Answer 5-2', 'response': false},{'answer': 'Answer 5-3', 'response': false},{'answer': 'Answer 5-4', 'response': false},]}]},"
				+ "{'logic':   [{'question': 'Question 1','answers': [{'answer': 'Answer 1-1', 'response': true},{'answer': 'Answer 1-2', 'response': false},{'answer': 'Answer 1-3', 'response': false},{'answer': 'Answer 1-4', 'response': false},]},{'question': 'Question 2','answers': [{'answer': 'Answer 2-1', 'response': false},{'answer': 'Answer 2-2', 'response': true},{'answer': 'Answer 2-3', 'response': false},{'answer': 'Answer 2-4', 'response': false},]},{			                  'question': 'Question 3',			                  'answers': [			                    {'answer': 'Answer 3-1', 'response': false},			                    {'answer': 'Answer 3-2', 'response': false},			                    {'answer': 'Answer 3-3', 'response': true},			                    {'answer': 'Answer 3-4', 'response': false},			                  ]			                },			                {			                  'question': 'Question 4',			                  'answers': [			                    {'answer': 'Answer 4-1', 'response': false},			                    {'answer': 'Answer 4-2', 'response': false},			                    {'answer': 'Answer 4-3', 'response': false},			                    {'answer': 'Answer 4-4', 'response': true},			                  ]			                },			                {			                  'question': 'Question 5',			                  'answers': [			                    {'answer': 'Answer 5-1', 'response': true},			                    {'answer': 'Answer 5-2', 'response': false},			                    {'answer': 'Answer 5-3', 'response': false},			                    {'answer': 'Answer 5-4', 'response': false},			                  ]			                }			              ]			            },			            {			              'math': [			                {			                  'question': 'Question 1',			                  'answers': [			                    {'answer': 'Answer 1-1', 'response': true},			                    {'answer': 'Answer 1-2', 'response': false},			                    {'answer': 'Answer 1-3', 'response': false},			                    {'answer': 'Answer 1-4', 'response': false},			                  ]			                },			                {			                  'question': 'Question 2',			                  'answers': [			                    {'answer': 'Answer 2-1', 'response': false},			                    {'answer': 'Answer 2-2', 'response': true},			                    {'answer': 'Answer 2-3', 'response': false},			                    {'answer': 'Answer 2-4', 'response': false},			                  ]			                },			                {			                  'question': 'Question 3',			                  'answers': [			                    {'answer': 'Answer 3-1', 'response': false},			                    {'answer': 'Answer 3-2', 'response': false},			                    {'answer': 'Answer 3-3', 'response': true},			                    {'answer': 'Answer 3-4', 'response': false},			                  ]			                },			                {			                  'question': 'Question 4',			                  'answers': [			                    {'answer': 'Answer 4-1', 'response': false},			                    {'answer': 'Answer 4-2', 'response': false},			                    {'answer': 'Answer 4-3', 'response': false},			                    {'answer': 'Answer 4-4', 'response': true},			                  ]			                },			                {			                  'question': 'Question 5',			                  'answers': [			                    {'answer': 'Answer 5-1', 'response': true},			                    {'answer': 'Answer 5-2', 'response': false},			                    {'answer': 'Answer 5-3', 'response': false},			                    {'answer': 'Answer 5-4', 'response': false},			                  ]			                }			              ]			            },			            {			              'religion': [			                {			                  'question': 'Question 1',			                  'answers': [			                    {'answer': 'Answer 1-1', 'response': true},{'answer': 'Answer 1-2', 'response': false},{'answer': 'Answer 1-3', 'response': false},{'answer': 'Answer 1-4', 'response': false},]},{'question': 'Question 2','answers': [{'answer': 'Answer 2-1', 'response': false},{'answer': 'Answer 2-2', 'response': true},{'answer': 'Answer 2-3', 'response': false},{'answer': 'Answer 2-4', 'response': false},]},{'question': 'Question 3','answers': [{'answer': 'Answer 3-1', 'response': false},{'answer': 'Answer 3-2', 'response': false},{'answer': 'Answer 3-3', 'response': true},{'answer': 'Answer 3-4', 'response': false},]},{'question': 'Question 4','answers': [{'answer': 'Answer 4-1', 'response': false},{'answer': 'Answer 4-2', 'response': false},{'answer': 'Answer 4-3', 'response': false},{'answer': 'Answer 4-4', 'response': true},]},{'question': 'Question 5','answers': [{'answer': 'Answer 5-1', 'response': true},{'answer': 'Answer 5-2', 'response': false},{'answer': 'Answer 5-3', 'response': false},{'answer': 'Answer 5-4', 'response': false},]}]}";
			        		JsonObject jsonObject = new JsonParser().parse(questions).getAsJsonObject();
	
		if (jsonObject != null) {
			return new ResponseEntity<>(jsonObject, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(jsonObject, HttpStatus.BAD_REQUEST);
		}*/
	}

}
