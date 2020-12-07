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
@Table(name = "question",schema="public")
@JsonInclude(value = Include.NON_NULL)
public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String description;
	private Integer category_id;
	
	public Question(){}
	
	public Question(Integer id, String description,Integer category_id){
		this.id= id;
		this.description= description;
		this.category_id= category_id;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "question_id")
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

	@Column(name= "category_id")
	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	
}
