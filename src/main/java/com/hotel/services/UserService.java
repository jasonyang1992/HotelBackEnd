package com.hotel.services;

import java.util.List;

import com.hotel.beans.Users;

public interface UserService {

	public List<Users> getUsers();
	public Users getUserById(int id);
	public Users addUser(Users users);
	public Users updateUser(Users users);
	public String deleteUserById(int id);
}
