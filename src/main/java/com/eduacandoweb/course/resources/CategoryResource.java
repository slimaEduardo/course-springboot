package com.eduacandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduacandoweb.course.entities.Category;
import com.eduacandoweb.course.services.CategoryService;

@RestController
@RequestMapping(value = "/Categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	@GetMapping
	public ResponseEntity<List> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	} 
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
