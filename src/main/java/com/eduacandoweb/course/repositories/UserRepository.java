package com.eduacandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
