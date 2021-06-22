package com.example.demoMySql.service;

import java.util.List;

import com.example.demoMySql.dto.UserDTO;
import com.example.demoMySql.model.User;

public interface IDemoMySqlService {
	
	List<User> getUser();

	User addUser(UserDTO dto);

	User updateUser(UserDTO dto, int id);

	User getUserById(int id);
}
