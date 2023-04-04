package com.Authentication.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Authentication.model.CustomUserDetails;
import com.Authentication.model.User;
import com.Authentication.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
	final User user = this.userRepository.findByUsername(userName);
		if(user==null) {
			throw new UsernameNotFoundException("User not found !");
		}
		else {
			return new CustomUserDetails(user);
		}
		
		//user database
	
		
		
		//if (userName.equals("Sumana")) {
			//return new User("Sumana","Sumana12",new ArrayList<>());
		//}
		//else {
			//throw new UsernameNotFoundException("User not found");
		//}
	}
}
