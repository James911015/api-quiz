package com.example.apiquiz.ws.controllers;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiquiz.ws.entities.Category;
import com.example.apiquiz.ws.entities.User;
import com.example.apiquiz.ws.services.CategoryService;

@RestController
@RequestMapping(value = "categoryws")
public class CategoryController {

	Logger log = Logger.getLogger(CategoryController.class.getName());

	@Autowired
	CategoryService categoryService;

	@GetMapping(value = "/")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.findAllCategories();
		if (categories != null && categories.size() > 0) {
			return new ResponseEntity<>(categories, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(categories, HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping(value = "/create")
	public ResponseEntity<Category> createCategory(@RequestBody Category categoryBody) {
		log.info(categoryBody.toString());
		Category category = categoryService.createCategory(categoryBody);
		if (category != null) {
			return new ResponseEntity<>(category, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(category, HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<Category>> findCategoryById(@PathVariable("id") Integer id) {
		Optional<Category> category = categoryService.findCategoryById(id);
		if (category != null) {
			return new ResponseEntity<>(category, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(category, HttpStatus.NO_CONTENT);
		}
	}

}
