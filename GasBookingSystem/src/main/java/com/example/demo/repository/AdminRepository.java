package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query("select a from Admin a where  login_tbl= :l")
	Optional<Admin> findadmin(Login l);


}
