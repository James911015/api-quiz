package com.example.apiquiz.ws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.apiquiz.ws.entities.Question;
import com.example.apiquiz.ws.entities.User;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	@Query(value = " SELECT * FROM public.question WHERE category_id = ?1 ", nativeQuery = true)
	List<Question> getAllQuestionByCategory(Integer category_id);
}
