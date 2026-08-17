package com.codewithme.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithme.www.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
