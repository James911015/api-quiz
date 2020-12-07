package com.example.apiquiz.ws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.apiquiz.ws.entities.Category;

public interface CategoryService {

	Category createCategory(Category category);
	
	List<Category> findAllCategories();
	
	Optional<Category> findCategoryById(Integer category_id);
}
