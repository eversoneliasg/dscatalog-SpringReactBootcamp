package com.eversonelias.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eversonelias.dscatalog.entities.Category;
import com.eversonelias.dscatalog.repositories.CategoryRepository;

@Service // It will register my class as a component of the dependency injection automated system.
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<Category> findAll() {
		return repository.findAll();
	}
}
