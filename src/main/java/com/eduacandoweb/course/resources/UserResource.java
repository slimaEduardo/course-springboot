package com.eduacandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduacandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1,"Maria","maria@gmail.com","999999999","123456");
		return ResponseEntity.ok().body(u);
	} 
	
}
