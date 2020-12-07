package com.example.apiquiz.ws.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiquiz.ws.entities.Category;
import com.example.apiquiz.ws.repository.CategoryRepository;
import com.example.apiquiz.ws.services.CategoryService;
import com.jayway.jsonpath.Option;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	public Optional<Category> findCategoryById(Integer category_id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(category_id);
	}

}
