package com.hotel.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.beans.Users;
import com.hotel.repositories.UserRespository;
import com.hotel.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRespository ur;
	
	@Override
	public List<Users> getUsers() {
		return ur.findAll();
	}

	@Override
	public Users getUserById(int id) {
		return ur.getOne(id);
	}

	@Override
	public Users addUser(Users users) {
		return ur.save(users);
	}

	@Override
	public Users updateUser(Users users) {
		return ur.save(users);
	}

	@Override
	public String deleteUserById(int id) {
		ur.deleteById(id);
		return "User with " +id + " has been deleted!";
	}

}
