package com.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.beans.Users;
import com.hotel.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService us;
	
	@GetMapping
	public List<Users> getUsers(){
		return us.getUsers();
	}
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable("id") int id) {
		return us.getUserById(id);
	}
	
	@PostMapping
	public ResponseEntity<Users> createUser(@RequestBody Users users) {
		return new ResponseEntity<>(us.addUser(users), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public Users updateUser(@RequestBody Users users) {
		return us.updateUser(users);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		return us.deleteUserById(id);
	}
}
