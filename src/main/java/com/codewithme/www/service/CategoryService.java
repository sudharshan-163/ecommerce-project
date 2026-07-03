package com.codewithme.www.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithme.www.entity.Category;
import com.codewithme.www.repository.CategoryRepository;

@Service
public class CategoryService {
		
		@Autowired
		private CategoryRepository categoryRepository;
		
		public void saveCategory(Category category) {
			categoryRepository.save(category);
		}
		
		public List<Category> getAll() {
			return categoryRepository.findAll();
		}
		public void deleteById(int id) {
			categoryRepository.deleteById(id);
		}
		public Optional<Category> fetchById(int id) {
			return categoryRepository.findById(id);
		}
}
