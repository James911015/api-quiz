package com.example.apiquiz.ws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.apiquiz.ws.entities.Answer;
import com.example.apiquiz.ws.entities.Question;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	@Query(value = " SELECT * FROM public.answer WHERE question_id = ?1 ", nativeQuery = true)
	List<Answer> getAllAnswerByQuestionId(Integer question_id);
}
