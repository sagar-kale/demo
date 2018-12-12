package com.example.logindemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.logindemo.model.UserLoginDetails;
import com.example.logindemo.service.UserLoginDetailsDao;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
@SpringBootApplication

public class LoginDemoApplication extends SpringBootServletInitializer {
	
	@Autowired
	UserLoginDetailsDao userLoginDetailsDao;
	
	 @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(LoginDemoApplication.class);
	  }

	public static void main(String[] args) {
	    SpringApplication.run(LoginDemoApplication.class, args);
	 }
	
	@GetMapping("/userDetails")
	public List<UserLoginDetails> getAllUsers() {
		System.out.println("In getAllUsers()");
 
		List<UserLoginDetails> users = new ArrayList<>();
		try {
			userLoginDetailsDao.findAll().forEach(users::add);
		} catch (Exception e) {
			System.out.println("getAllUsers() :: Exception occured while getting the data " + e.getMessage());
		}
		return users;
	}
}
