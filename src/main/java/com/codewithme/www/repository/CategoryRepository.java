package com.codewithme.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.codewithme.www.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
