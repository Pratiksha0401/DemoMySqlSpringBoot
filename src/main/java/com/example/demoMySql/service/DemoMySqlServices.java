package com.example.demoMySql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoMySql.dto.UserDTO;
import com.example.demoMySql.model.User;
import com.example.demoMySql.repository.DemoMySqlRepository;

@Service
public class DemoMySqlServices implements IDemoMySqlService {
	
	@Autowired
	private DemoMySqlRepository repo;
	
	@Override
	public List<User> getUser() {
		return repo.findAll();
	}
	
	@Override
	public User addUser(UserDTO dto) {
		User user = new User(dto);
		return repo.save(user);
	}
	
	@Override
	public User updateUser(UserDTO dto, int id) {
		User user=repo.findById(id).orElse(null);
		user.setName(dto.name);
		user.setSalary(dto.salary);
		return repo.save(user);
	}
	
	@Override
	public User getUserById(int id) {
		User user= repo.findById(id).orElse(null);
		return user;
	}

	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

//	public void deleteUser(int id) {
//		User user=repo.findById(id).orElse(null);
//		repo.delete(user);;
//	}

}
