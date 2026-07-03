package com.codewithme.www.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithme.www.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findALLByCategory_Id(int id);
	
}
