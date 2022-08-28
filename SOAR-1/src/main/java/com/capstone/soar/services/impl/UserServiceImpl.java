package com.capstone.soar.services.impl;

import java.util.Set;
//import java.

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.soar.entity.User;
import com.capstone.soar.entity.UserRole;
import com.capstone.soar.repository.RoleRepository;
import com.capstone.soar.repository.UserRepository;
import com.capstone.soar.services.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception{
	
		User local=this.userRepository.findByName(user.getName());
		if(local!=null) {
			System.out.println("User is already Present !!!");
			throw new Exception("User already Present !!");
		}
		else {
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=this.userRepository.save(user);
		}
		return local;
	}

}
