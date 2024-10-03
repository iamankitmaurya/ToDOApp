package com.all.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TodoList {
	@Id
	private int id;
	private String name ;
	private String description;

}
