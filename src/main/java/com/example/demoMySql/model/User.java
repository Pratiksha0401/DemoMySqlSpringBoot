package com.example.demoMySql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demoMySql.dto.UserDTO;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long salary;
	
	public User() {
	}
	
	public User(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public User(UserDTO dto) {
		this.name=dto.name;
		this.salary=dto.salary;
	}
	
	public User(UserDTO dto, int id) {
		this.id=id;
		this.name=dto.name;
		this.salary=dto.salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}
