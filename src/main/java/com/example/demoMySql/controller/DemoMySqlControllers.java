package com.example.demoMySql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoMySql.dto.ResponseDTO;
import com.example.demoMySql.dto.UserDTO;
import com.example.demoMySql.model.User;
import com.example.demoMySql.service.DemoMySqlServices;

@RestController
@RequestMapping("/user")
public class DemoMySqlControllers {

	@Autowired
	private DemoMySqlServices demoservice;
	
	
	//curl "localhost:8080/user" -w "\n"
		
	@GetMapping
	public ResponseEntity<ResponseDTO> getUserData() {	
		List<User> list = null;
		list = demoservice.getUser();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful ",list);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<ResponseDTO> getUserById(@PathVariable("Id") int id) {	
		User user = demoservice.getUserById(id);
		ResponseDTO respDTO = new ResponseDTO("Get Call By Id Successful ",user);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ResponseDTO> addUser(@RequestBody UserDTO dto){
		User user = demoservice.addUser(dto);
		ResponseDTO respDTO = new ResponseDTO("User Added Successfully ",user);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/{Id}")
	public ResponseEntity<ResponseDTO> updateUser(@PathVariable("Id") int id,@RequestBody UserDTO dto){
		User user = demoservice.updateUser(dto, id);
		ResponseDTO respDTO = new ResponseDTO("User Updated Successfully ",user);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/{Id}")
	public ResponseEntity<ResponseDTO> updateUser(@PathVariable("Id") int id){
		demoservice.deleteUser(id);
		ResponseDTO respDTO = new ResponseDTO("User Updated Successfully ",id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
