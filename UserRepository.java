package com.Form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Form.entity.User;


public interface UserRepository extends JpaRepository<User,Integer> 
 {
	User  findByEmail(String email);
}
