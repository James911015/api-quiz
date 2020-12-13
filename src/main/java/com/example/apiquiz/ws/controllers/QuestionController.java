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

	@GetMapping(path = "/questions/{category}")
	public ResponseEntity<CategoryJson> getAllQuestion(@PathVariable("category") String category) {

		if (category.equalsIgnoreCase("english")) {
			Answers[] list_en_answers_1 = new Answers[4];
			list_en_answers_1[0] = new Answers("a. Preguntar", true);
			list_en_answers_1[1] = new Answers("b. Responder", false);
			list_en_answers_1[2] = new Answers("c. Asco", false);
			list_en_answers_1[3] = new Answers("d. Ninguna", false);

			QuestionAndAnswers en_1 = new QuestionAndAnswers("Selecciona la traducción correcta de ASK", list_en_answers_1);

			Answers en_2_1 = new Answers("a. Comer", false);
			Answers en_2_2 = new Answers("b. Venir", true);
			Answers en_2_3 = new Answers("c. Llamar", false);
			Answers en_2_4 = new Answers("d. Casa", false);
			Answers[] list_en_answers_2 = new Answers[4];
			list_en_answers_2[0] = en_2_1;
			list_en_answers_2[1] = en_2_2;
			list_en_answers_2[2] = en_2_3;
			list_en_answers_2[3] = en_2_4;
			QuestionAndAnswers en_2 = new QuestionAndAnswers("Selecciona la traducción correcta de COME", list_en_answers_2);

			Answers en_3_1 = new Answers("a. Sentase", false);
			Answers en_3_2 = new Answers("b. Hacer", false);
			Answers en_3_3 = new Answers("c. Parecer", true);
			Answers en_3_4 = new Answers("d. Usar", false);
			Answers[] list_en_answers_3 = new Answers[4];
			list_en_answers_3[0] = en_3_1;
			list_en_answers_3[1] = en_3_2;
			list_en_answers_3[2] = en_3_3;
			list_en_answers_3[3] = en_3_4;
			QuestionAndAnswers en_3 = new QuestionAndAnswers("Selecciona la traducción correcta de SEEM", list_en_answers_3);

			Answers en_4_1 = new Answers("a. Trabajar", false);
			Answers en_4_2 = new Answers("b. Hablar", false);
			Answers en_4_3 = new Answers("c. Desear", false);
			Answers en_4_4 = new Answers("d. Querer", true);
			Answers[] list_en_answers_4 = new Answers[4];
			list_en_answers_4[0] = en_4_1;
			list_en_answers_4[1] = en_4_2;
			list_en_answers_4[2] = en_4_3;
			list_en_answers_4[3] = en_4_4;
			QuestionAndAnswers en_4 = new QuestionAndAnswers("Selecciona la traducción correcta de WANT", list_en_answers_4);

			/*
			 * Answers en_5_1 = new Answers("answer5_1", false); Answers en_5_2
			 * = new Answers("answer5_2", false); Answers en_5_3 = new
			 * Answers("answer5_3", false); Answers en_5_4 = new
			 * Answers("answer5_4", true); Answers[] list_en_answers_5 = new
			 * Answers[4]; list_en_answers_5[0] = en_5_1; list_en_answers_5[1] =
			 * en_5_2; list_en_answers_5[2] = en_5_3; list_en_answers_5[3] =
			 * en_5_4; QuestionAndAnswers en_5 = new
			 * QuestionAndAnswers("Pregunta5", list_en_answers_5);
			 */

			ArrayList<QuestionAndAnswers> list_en_questions = new ArrayList<>();
			list_en_questions.add(en_1);
			list_en_questions.add(en_2);
			list_en_questions.add(en_3);
			list_en_questions.add(en_4);
			// list_en_questions.add(en_5);

			CategoryJson CategoryEnglish = new CategoryJson("english", list_en_questions);
			return new ResponseEntity<>(CategoryEnglish, HttpStatus.OK);

		} else if (category.equalsIgnoreCase("science")) {
			
			Answers[] list_en_answers_1 = new Answers[4];
			list_en_answers_1[0] = new Answers("a. El píe.", false);
			list_en_answers_1[1] = new Answers("b. La Mano.", true);
			list_en_answers_1[2] = new Answers("c. El Rostro.", false);
			list_en_answers_1[3] = new Answers("d. Ninguna de las anteriores.", false);

			QuestionAndAnswers en_1 = new QuestionAndAnswers("¿Cual es la parte del cuerpo humano que tiene más huesos?", list_en_answers_1);

			Answers en_2_1 = new Answers("a. Avestruz.", false);
			Answers en_2_2 = new Answers("b. Cuervo.", false);
			Answers en_2_3 = new Answers("c. Erizo.", false);
			Answers en_2_4 = new Answers("d. Cocodrilo.", true);
			Answers[] list_en_answers_2 = new Answers[4];
			list_en_answers_2[0] = en_2_1;
			list_en_answers_2[1] = en_2_2;
			list_en_answers_2[2] = en_2_3;
			list_en_answers_2[3] = en_2_4;
			QuestionAndAnswers en_2 = new QuestionAndAnswers("¿Cual de los siguientes animales no es omnívoro?", list_en_answers_2);

			Answers en_3_1 = new Answers("a. Antenas y cuatro patas.", false);
			Answers en_3_2 = new Answers("b. Alas y Antenas.", false);
			Answers en_3_3 = new Answers("c. Antenas y seis patas.", true);
			Answers en_3_4 = new Answers("d. Dos ojos y Alas.", false);
			Answers[] list_en_answers_3 = new Answers[4];
			list_en_answers_3[0] = en_3_1;
			list_en_answers_3[1] = en_3_2;
			list_en_answers_3[2] = en_3_3;
			list_en_answers_3[3] = en_3_4;
			QuestionAndAnswers en_3 = new QuestionAndAnswers("¿Que comparten todos los insectos?", list_en_answers_3);

			Answers en_4_1 = new Answers("a. Pez Espada.", true);
			Answers en_4_2 = new Answers("b. Delfín.", false);
			Answers en_4_3 = new Answers("c. Orca.", false);
			Answers en_4_4 = new Answers("d. Manatí.", false);
			Answers[] list_en_answers_4 = new Answers[4];
			list_en_answers_4[0] = en_4_1;
			list_en_answers_4[1] = en_4_2;
			list_en_answers_4[2] = en_4_3;
			list_en_answers_4[3] = en_4_4;
			QuestionAndAnswers en_4 = new QuestionAndAnswers("¿Cual de los siguientes animales no es un mamífero?", list_en_answers_4);

			/*
			 * Answers en_5_1 = new Answers("answer5_1", false); Answers en_5_2
			 * = new Answers("answer5_2", false); Answers en_5_3 = new
			 * Answers("answer5_3", false); Answers en_5_4 = new
			 * Answers("answer5_4", true); Answers[] list_en_answers_5 = new
			 * Answers[4]; list_en_answers_5[0] = en_5_1; list_en_answers_5[1] =
			 * en_5_2; list_en_answers_5[2] = en_5_3; list_en_answers_5[3] =
			 * en_5_4; QuestionAndAnswers en_5 = new
			 * QuestionAndAnswers("Pregunta5", list_en_answers_5);
			 */

			ArrayList<QuestionAndAnswers> list_en_questions = new ArrayList<>();
			list_en_questions.add(en_1);
			list_en_questions.add(en_2);
			list_en_questions.add(en_3);
			list_en_questions.add(en_4);
			// list_en_questions.add(en_5);

			CategoryJson CategoryEnglish = new CategoryJson("science", list_en_questions);
			return new ResponseEntity<>(CategoryEnglish, HttpStatus.OK);

		} else if (category.equalsIgnoreCase("history")) {
			
			Answers[] list_en_answers_1 = new Answers[4];
			list_en_answers_1[0] = new Answers("a. 1492", true);
			list_en_answers_1[1] = new Answers("b. 1500", false);
			list_en_answers_1[2] = new Answers("c. 2009", false);
			list_en_answers_1[3] = new Answers("d. Ninguna de las anteriores", false);

			QuestionAndAnswers en_1 = new QuestionAndAnswers("¿En que año descubrió Colón América?", list_en_answers_1);

			Answers en_2_1 = new Answers("a. Primera cruzada", false);
			Answers en_2_2 = new Answers("b. Guerra de las galaxias", false);
			Answers en_2_3 = new Answers("c. La guerra de los 100 años", true);
			Answers en_2_4 = new Answers("d. Ninguna de las anteriores", false);
			Answers[] list_en_answers_2 = new Answers[4];
			list_en_answers_2[0] = en_2_1;
			list_en_answers_2[1] = en_2_2;
			list_en_answers_2[2] = en_2_3;
			list_en_answers_2[3] = en_2_4;
			QuestionAndAnswers en_2 = new QuestionAndAnswers("¿En que guerra participó Juana de Arco?", list_en_answers_2);

			Answers en_3_1 = new Answers("a. Cuzco", true);
			Answers en_3_2 = new Answers("b. Quito", false);
			Answers en_3_3 = new Answers("c. Bilbao", true);
			Answers en_3_4 = new Answers("d. Ninguna de las anteriores", false);
			Answers[] list_en_answers_3 = new Answers[4];
			list_en_answers_3[0] = en_3_1;
			list_en_answers_3[1] = en_3_2;
			list_en_answers_3[2] = en_3_3;
			list_en_answers_3[3] = en_3_4;
			QuestionAndAnswers en_3 = new QuestionAndAnswers("¿Cuál era la capital del Imperio Inca?", list_en_answers_3);

			Answers en_4_1 = new Answers("a. Siglo XVI", false);
			Answers en_4_2 = new Answers("b. Siglo XVII", false);
			Answers en_4_3 = new Answers("a. Siglo XXX", false);
			Answers en_4_4 = new Answers("d. Ninguna de las anteriores", true);
			Answers[] list_en_answers_4 = new Answers[4];
			list_en_answers_4[0] = en_4_1;
			list_en_answers_4[1] = en_4_2;
			list_en_answers_4[2] = en_4_3;
			list_en_answers_4[3] = en_4_4;
			QuestionAndAnswers en_4 = new QuestionAndAnswers("¿Cuándo se produjo principalmente el Siglo de Oro?", list_en_answers_4);

			/*
			 * Answers en_5_1 = new Answers("answer5_1", false); Answers en_5_2
			 * = new Answers("answer5_2", false); Answers en_5_3 = new
			 * Answers("answer5_3", false); Answers en_5_4 = new
			 * Answers("answer5_4", true); Answers[] list_en_answers_5 = new
			 * Answers[4]; list_en_answers_5[0] = en_5_1; list_en_answers_5[1] =
			 * en_5_2; list_en_answers_5[2] = en_5_3; list_en_answers_5[3] =
			 * en_5_4; QuestionAndAnswers en_5 = new
			 * QuestionAndAnswers("Pregunta5", list_en_answers_5);
			 */

			ArrayList<QuestionAndAnswers> list_en_questions = new ArrayList<>();
			list_en_questions.add(en_1);
			list_en_questions.add(en_2);
			list_en_questions.add(en_3);
			list_en_questions.add(en_4);
			// list_en_questions.add(en_5);

			CategoryJson CategoryEnglish = new CategoryJson("spanish", list_en_questions);
			return new ResponseEntity<>(CategoryEnglish, HttpStatus.OK);

		} else if (category.equalsIgnoreCase("logic")) {
			
			Answers[] list_en_answers_1 = new Answers[4];
			list_en_answers_1[0] = new Answers("a. 4 vacas.", false);
			list_en_answers_1[1] = new Answers("b. Ninguna vaca.", false);
			list_en_answers_1[2] = new Answers("c. 10 vacas.", false);
			list_en_answers_1[3] = new Answers("d. 6 vacas.", true);

			QuestionAndAnswers en_1 = new QuestionAndAnswers("En un corral tienen diez vacas, todas mueren menos seis. ¿Cuántas Vacas quedan?", list_en_answers_1);

			Answers en_2_1 = new Answers("a. De primero.", false);
			Answers en_2_2 = new Answers("b. De segundo.", true);
			Answers en_2_3 = new Answers("c. De ultimo.", false);
			Answers en_2_4 = new Answers("d. Ninguna de las anteriores.", false);
			Answers[] list_en_answers_2 = new Answers[4];
			list_en_answers_2[0] = en_2_1;
			list_en_answers_2[1] = en_2_2;
			list_en_answers_2[2] = en_2_3;
			list_en_answers_2[3] = en_2_4;
			QuestionAndAnswers en_2 = new QuestionAndAnswers("¿En que posición quedas si adelantas al segundo en una carrera?", list_en_answers_2);

			Answers en_3_1 = new Answers("a. Solo un mes.", false);
			Answers en_3_2 = new Answers("b. Todos los meses.", true);
			Answers en_3_3 = new Answers("c. Seis meses.", false);
			Answers en_3_4 = new Answers("d. Ningún mes.", false);
			Answers[] list_en_answers_3 = new Answers[4];
			list_en_answers_3[0] = en_3_1;
			list_en_answers_3[1] = en_3_2;
			list_en_answers_3[2] = en_3_3;
			list_en_answers_3[3] = en_3_4;
			QuestionAndAnswers en_3 = new QuestionAndAnswers("¿Cuantos meses tienen 28 días?", list_en_answers_3);

			Answers en_4_1 = new Answers("a. Hacia el Sur.", false);
			Answers en_4_2 = new Answers("b. Hacia el Norte.", false);
			Answers en_4_3 = new Answers("c. Hacia el Occidente.", false);
			Answers en_4_4 = new Answers("d. Hacia ningún lado, es eléctrico.", true);
			Answers[] list_en_answers_4 = new Answers[4];
			list_en_answers_4[0] = en_4_1;
			list_en_answers_4[1] = en_4_2;
			list_en_answers_4[2] = en_4_3;
			list_en_answers_4[3] = en_4_4;
			QuestionAndAnswers en_4 = new QuestionAndAnswers("¿Si un tren eléctrico va de Norte a sur. ¿hacia qué lado echará el humo?", list_en_answers_4);

			/*
			 * Answers en_5_1 = new Answers("answer5_1", false); Answers en_5_2
			 * = new Answers("answer5_2", false); Answers en_5_3 = new
			 * Answers("answer5_3", false); Answers en_5_4 = new
			 * Answers("answer5_4", true); Answers[] list_en_answers_5 = new
			 * Answers[4]; list_en_answers_5[0] = en_5_1; list_en_answers_5[1] =
			 * en_5_2; list_en_answers_5[2] = en_5_3; list_en_answers_5[3] =
			 * en_5_4; QuestionAndAnswers en_5 = new
			 * QuestionAndAnswers("Pregunta5", list_en_answers_5);
			 */

			ArrayList<QuestionAndAnswers> list_en_questions = new ArrayList<>();
			list_en_questions.add(en_1);
			list_en_questions.add(en_2);
			list_en_questions.add(en_3);
			list_en_questions.add(en_4);
			// list_en_questions.add(en_5);

			CategoryJson CategoryEnglish = new CategoryJson("logic", list_en_questions);
			return new ResponseEntity<>(CategoryEnglish, HttpStatus.OK);

		} else if (category.equalsIgnoreCase("math")) {
			
			Answers[] list_en_answers_1 = new Answers[4];
			list_en_answers_1[0] = new Answers("a. 4", true);
			list_en_answers_1[1] = new Answers("b. 6", false);
			list_en_answers_1[2] = new Answers("c. 8", false);
			list_en_answers_1[3] = new Answers("d. 10", false);

			QuestionAndAnswers en_1 = new QuestionAndAnswers("¿Cuanto es 2x2?", list_en_answers_1);

			Answers en_2_1 = new Answers("a. 1.000.000 unidades", false);
			Answers en_2_2 = new Answers("b. 100.000 unidades.", true);
			Answers en_2_3 = new Answers("c. 10.000 unidades.", false);
			Answers en_2_4 = new Answers("d. 1000 unidades.", false);
			Answers[] list_en_answers_2 = new Answers[4];
			list_en_answers_2[0] = en_2_1;
			list_en_answers_2[1] = en_2_2;
			list_en_answers_2[2] = en_2_3;
			list_en_answers_2[3] = en_2_4;
			QuestionAndAnswers en_2 = new QuestionAndAnswers("¿Cuantas unidades equivale 10 decenas de millar?", list_en_answers_2);

			Answers en_3_1 = new Answers("a. 50", false);
			Answers en_3_2 = new Answers("b. 55", false);
			Answers en_3_3 = new Answers("c. 60", true);
			Answers en_3_4 = new Answers("d. Ninguna.", false);
			Answers[] list_en_answers_3 = new Answers[4];
			list_en_answers_3[0] = en_3_1;
			list_en_answers_3[1] = en_3_2;
			list_en_answers_3[2] = en_3_3;
			list_en_answers_3[3] = en_3_4;
			QuestionAndAnswers en_3 = new QuestionAndAnswers("¿Cual es la decena más próxima de 58?", list_en_answers_3);

			Answers en_4_1 = new Answers("a. Cinco.", true);
			Answers en_4_2 = new Answers("b. Diez.", false);
			Answers en_4_3 = new Answers("c. Cuatro.", false);
			Answers en_4_4 = new Answers("d. Uno.", false);
			Answers[] list_en_answers_4 = new Answers[4];
			list_en_answers_4[0] = en_4_1;
			list_en_answers_4[1] = en_4_2;
			list_en_answers_4[2] = en_4_3;
			list_en_answers_4[3] = en_4_4;
			QuestionAndAnswers en_4 = new QuestionAndAnswers("¿Que cantidad expresa el numero romano V?", list_en_answers_4);

			/*
			 * Answers en_5_1 = new Answers("answer5_1", false); Answers en_5_2
			 * = new Answers("answer5_2", false); Answers en_5_3 = new
			 * Answers("answer5_3", false); Answers en_5_4 = new
			 * Answers("answer5_4", true); Answers[] list_en_answers_5 = new
			 * Answers[4]; list_en_answers_5[0] = en_5_1; list_en_answers_5[1] =
			 * en_5_2; list_en_answers_5[2] = en_5_3; list_en_answers_5[3] =
			 * en_5_4; QuestionAndAnswers en_5 = new
			 * QuestionAndAnswers("Pregunta5", list_en_answers_5);
			 */

			ArrayList<QuestionAndAnswers> list_en_questions = new ArrayList<>();
			list_en_questions.add(en_1);
			list_en_questions.add(en_2);
			list_en_questions.add(en_3);
			list_en_questions.add(en_4);
			// list_en_questions.add(en_5);

			CategoryJson CategoryEnglish = new CategoryJson("math", list_en_questions);
			return new ResponseEntity<>(CategoryEnglish, HttpStatus.OK);

		} else if (category.equalsIgnoreCase("religion")) {
			
			Answers[] list_en_answers_1 = new Answers[4];
			list_en_answers_1[0] = new Answers("a. 250 millones de especies.", false);
			list_en_answers_1[1] = new Answers("b. 645 millones de especies.", false);
			list_en_answers_1[2] = new Answers("c. 7,77 millones de especies.", false);
			list_en_answers_1[3] = new Answers("d. Ninguna porque era Noé.", true);

			QuestionAndAnswers en_1 = new QuestionAndAnswers("¿Cuantos animales metió Moisés en el arca?", list_en_answers_1);

			Answers en_2_1 = new Answers("a. 1 día.", false);
			Answers en_2_2 = new Answers("b. 3 días.", true);
			Answers en_2_3 = new Answers("c. 6 días.", false);
			Answers en_2_4 = new Answers("d. 4 días.", false);
			Answers[] list_en_answers_2 = new Answers[4];
			list_en_answers_2[0] = en_2_1;
			list_en_answers_2[1] = en_2_2;
			list_en_answers_2[2] = en_2_3;
			list_en_answers_2[3] = en_2_4;
			QuestionAndAnswers en_2 = new QuestionAndAnswers("¿En cuantos días resucitó Jesús?", list_en_answers_2);

			Answers en_3_1 = new Answers("a. Judas Tadeo.", false);
			Answers en_3_2 = new Answers("b. Judas Macabeo.", false);
			Answers en_3_3 = new Answers("c. Judas Iscariote.", true);
			Answers en_3_4 = new Answers("d. Judas Galileo.", false);
			Answers[] list_en_answers_3 = new Answers[4];
			list_en_answers_3[0] = en_3_1;
			list_en_answers_3[1] = en_3_2;
			list_en_answers_3[2] = en_3_3;
			list_en_answers_3[3] = en_3_4;
			QuestionAndAnswers en_3 = new QuestionAndAnswers("¿Quien de los discípulos traicionó a Jesús?", list_en_answers_3);

			Answers en_4_1 = new Answers("a. El sexto día", false);
			Answers en_4_2 = new Answers("b. El primer día", true);
			Answers en_4_3 = new Answers("c. El séptimo día", false);
			Answers en_4_4 = new Answers("d. El Cuarto día", false);
			Answers[] list_en_answers_4 = new Answers[4];
			list_en_answers_4[0] = en_4_1;
			list_en_answers_4[1] = en_4_2;
			list_en_answers_4[2] = en_4_3;
			list_en_answers_4[3] = en_4_4;
			QuestionAndAnswers en_4 = new QuestionAndAnswers("¿En que día fueron hechos los cielos y la tierra?", list_en_answers_4);

			/*
			 * Answers en_5_1 = new Answers("answer5_1", false); Answers en_5_2
			 * = new Answers("answer5_2", false); Answers en_5_3 = new
			 * Answers("answer5_3", false); Answers en_5_4 = new
			 * Answers("answer5_4", true); Answers[] list_en_answers_5 = new
			 * Answers[4]; list_en_answers_5[0] = en_5_1; list_en_answers_5[1] =
			 * en_5_2; list_en_answers_5[2] = en_5_3; list_en_answers_5[3] =
			 * en_5_4; QuestionAndAnswers en_5 = new
			 * QuestionAndAnswers("Pregunta5", list_en_answers_5);
			 */

			ArrayList<QuestionAndAnswers> list_en_questions = new ArrayList<>();
			list_en_questions.add(en_1);
			list_en_questions.add(en_2);
			list_en_questions.add(en_3);
			list_en_questions.add(en_4);
			// list_en_questions.add(en_5);

			CategoryJson CategoryEnglish = new CategoryJson("religion", list_en_questions);
			return new ResponseEntity<>(CategoryEnglish, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
	}

}
