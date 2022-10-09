package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Customer;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CustomerRepository;
@Service
public class AdminService {
	
	@Autowired
	AdminRepository ar;
	
	public Admin save(Admin a) {
	return ar.save(a);
	}
	
	
	public List<Admin> getAll()
	{
		return ar.findAll();
	}

}
