package com.capstone.soar;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.capstone.soar.entity.User;
import com.capstone.soar.services.UserService;

@SpringBootApplication
//@EnableJpaRepositories("com.capstone.soar.repository")
public class Soar1Application implements CommandLineRunner{

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(Soar1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hi");
		User user = new User();
		user.setName("Siddhesh");
		user.setEmail("sid@gmail.com");
		user.setPassword("sid");
		user.setType("dev");
		
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("Software Developer");
	}
	
}
