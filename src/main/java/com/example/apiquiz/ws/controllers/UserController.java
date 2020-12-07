package com.example.apiquiz.ws.controllers;

import java.util.List;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiquiz.ws.entities.User;
import com.example.apiquiz.ws.services.UserService;

@RestController
@RequestMapping(value = "userws")
public class UserController {

	Logger log = Logger.getLogger(UserController.class.getName());

	@Autowired
	UserService userService;

	@GetMapping(value = "/")
	public ResponseEntity<List<User>> getUsers() {
		List<User> user = userService.getAllUsers();
		if (user != null && user.size() > 0) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(user, HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping(value = "/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		log.info(user.toString());
		User userReturn = userService.createUser(user);
		if (userReturn != null) {
			return new ResponseEntity<>(userReturn, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(userReturn, HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping(path = "/login/{email}/{password}")
	public ResponseEntity<User> findUserByEmailAndPassword(@PathVariable("email") String email,
			@PathVariable("password") String password) {
		log.info(email + " " + password);
		User user = userService.findUserByEmailAndPassword(email, password);
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(user, HttpStatus.NO_CONTENT);
		}
	}

}
