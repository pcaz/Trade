package com.presenceweb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.presenceweb.model.User;
import com.presenceweb.repository.UserRepository;

public class UserSecurityService implements UserDetailsService {

	private UserRepository userRepository;
	
	@Autowired
    public UserSecurityService(UserRepository userRepository) {
		super();
        this.userRepository = userRepository;
    }
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
