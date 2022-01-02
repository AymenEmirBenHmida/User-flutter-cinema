package com.Security.users.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Security.users.entities.Role;
import com.Security.users.entities.User;
import com.Security.users.repos.RoleRepository;
import com.Security.users.repos.UserRepository;
import com.Security.users.service.UserService;

@RestController
@CrossOrigin("*")
public class restController {
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.POST,path ="/addUser")
	public String addFILM(@RequestBody User user ) {
		userService.addRole(new Role(null, "USER"));
		userService.saveUser(user);
		return "ok";


	}
}

