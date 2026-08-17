package com.codewithme.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithme.www.entity.Admin;
import com.codewithme.www.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public void save(Admin a) {
		adminRepository.save(a);
	}
	public List<Admin> fetchAll(){
		return adminRepository.findAll();
	}
	
}
