package com.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.beans.Users;

@Repository
public interface UserRespository extends JpaRepository<Users, Integer>{

}
