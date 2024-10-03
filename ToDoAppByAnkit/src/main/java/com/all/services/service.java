package com.all.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.entity.TodoList;
import com.all.repo.todoRepository;

@Service
public class service {
	@Autowired
	private todoRepository tRepository;
	
	
	public List<TodoList> getList(){
		return tRepository.findAll();
	}
	
	public Optional<TodoList> getById(int id) {
		return tRepository.findById(id);
	}

}
