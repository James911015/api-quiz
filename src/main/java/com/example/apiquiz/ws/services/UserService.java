package com.example.apiquiz.ws.services;

import java.util.List;

import com.example.apiquiz.ws.entities.User;

public interface UserService {
	
	List<User> getAllUsers();
	
	User createUser(User user);
	
	User findUserByEmailAndPassword(String email, String password);

}
