package com.Authentication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Authentication.model.User;


public interface UserRepository extends JpaRepository<User,Long>  {
	
	//username, it will return the given user name
	public User findByUsername(String Username);

}
