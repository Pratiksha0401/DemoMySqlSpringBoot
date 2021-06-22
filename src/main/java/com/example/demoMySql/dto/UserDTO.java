package com.example.demoMySql.dto;

public class UserDTO {
	public String name;
	public long salary;
	
	public UserDTO() {
	}

	public UserDTO(String name, long salary) {	
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", salary=" + salary + "]";
	}
}
