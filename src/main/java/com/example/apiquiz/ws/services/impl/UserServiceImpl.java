package com.example.apiquiz.ws.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiquiz.ws.entities.User;
import com.example.apiquiz.ws.repository.UserRepository;
import com.example.apiquiz.ws.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User findUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.login(email, password);
	}

}
