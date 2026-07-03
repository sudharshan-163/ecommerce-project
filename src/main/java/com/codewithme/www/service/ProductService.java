package com.codewithme.www.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithme.www.entity.Product;
import com.codewithme.www.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public void saveProduct(Product p) {
		productRepository.save(p);
	}
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	public void deleteById(long id) {
		productRepository.deleteById(id);
	}
	public Optional<Product> fetchById(long id) {
		return productRepository.findById(id);
	}
	public List<Product> getProductCatId(int id) {
		return productRepository.findALLByCategory_Id(id);
	}
	
}
