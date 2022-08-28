package com.capstone.soar.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.capstone.soar.entity.User;
import com.capstone.soar.entity.UserRole;

@Service
public interface UserService {
	public User createUser(User user,Set<UserRole> userRoles)  throws Exception ;
}
