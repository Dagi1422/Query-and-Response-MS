package com.ecc.QueryManagement.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecc.QueryManagement.models.User;
import com.ecc.QueryManagement.models.UserDto;
import com.ecc.QueryManagement.services.UserRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/createUser")
	public String showCreateUserPage(Model model) {
		UserDto userDto = new UserDto();
		model.addAttribute("userDto", userDto);
		return "/CreateAccount";
	}
	
	@PostMapping("/createUser")
	public String createUser(
			@Valid @ModelAttribute UserDto userDto,
			BindingResult result
			) {
		
		
		User user = new User();
		
		user.setUsername(userDto.getUserName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setRole(userDto.getRole());
		
		
		repo.save(user);
		
		
		if (result.hasErrors()) {
			return "/CreateAccount";
		}
		return "redirect:/";
	}
}
