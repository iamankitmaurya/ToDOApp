package com.all.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.all.entity.TodoList;

public interface todoRepository extends JpaRepository<TodoList,Integer>{

}
