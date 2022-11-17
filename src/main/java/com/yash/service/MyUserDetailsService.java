package com.yash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yash.model.MyUserDetails;
import com.yash.model.User;
import com.yash.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user=repo.findByUsername(username);
		user.orElseThrow(()-> new UsernameNotFoundException("user doesnot exits"));
		
		return new MyUserDetails(user.get());
	}

}
