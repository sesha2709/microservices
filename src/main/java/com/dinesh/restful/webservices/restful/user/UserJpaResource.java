package com.dinesh.restful.webservices.restful.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserJpaResource {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/jpa/users")
	public List<User> getUserDetails() {
		return userRepo.findAll();

	}

	@GetMapping("/jpa/users/{id}")
	public Optional<User> retrieveUser(@PathVariable int id) {

		Optional<User> user = userRepo.findById(id);

		return user;
	}

}