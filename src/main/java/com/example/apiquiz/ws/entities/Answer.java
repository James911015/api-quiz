package com.example.apiquiz.ws.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "answer",schema="public")
@JsonInclude(value = Include.NON_NULL)
public class Answer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String description;
	private Integer question_id;
	private boolean response;
	
	public Answer(){}
	
	public Answer(Integer id,String description,Integer question_id,boolean response){
		this.id= id;
		this.description= description;
		this.question_id= question_id;
		this.response= response;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "answer_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name= "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name= "question_id")
	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}

	@Column(name= "response")
	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}
	
	

}
