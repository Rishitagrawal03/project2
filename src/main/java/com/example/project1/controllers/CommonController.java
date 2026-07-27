package com.example.project1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.DTOs.UserDto;


@RestController
@RequestMapping()
public class CommonController {

	@GetMapping("/getUserData")
	public List<UserDto> getUserData() {
		
		List<UserDto> users = new ArrayList<>();

	    UserDto u1 = new UserDto();
	    u1.setId(1);
	    u1.setName("Rohit Sharma");
	    u1.setEmail("rohit@example.com");

	    UserDto u2 = new UserDto();
	    u2.setId(2);
	    u2.setName("Virat Kohli");
	    u2.setEmail("virat@example.com");

	    UserDto u3 = new UserDto();
	    u3.setId(3);
	    u3.setName("Hardik Pandya");
	    u3.setEmail("hardik@example.com");

	    users.add(u1);
	    users.add(u2);
	    users.add(u3);

	    return users;
	}	
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Service 1!";
	    }
	
}
