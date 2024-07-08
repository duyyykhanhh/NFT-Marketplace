package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Users;

public interface UserRebository extends JpaRepository<Users, Integer> {
	
	@Query("SELECT u FROM Users u Where u.username = ?1")
	Users findByUsername(String username);
	
}
