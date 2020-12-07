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
@Table(name = "user",schema="public")
@JsonInclude(value = Include.NON_NULL)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer user_id;
	private String name;
	private Integer age;
	private String email;
	private String password;
	
	public User(){}
	
	public User(String name, Integer age,String email,String password){
		//this.user_id= user_id;
		this.name= name;
		this.age= age;
		this.email= email;
		this.password= password;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "user_id")
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Column(name= "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name= "age")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name= "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name= "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", age=" + age + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

}
