package com.artince.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artince.test.dto.UserDto;
import com.artince.test.extra.BaseDto;
import com.artince.test.service.UserService;

@RestController
@RequestMapping("/api/v1/test")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(value="/save")
	public BaseDto save(@RequestBody UserDto userDto) {
		return userService.save(userDto);
	}
	
	@GetMapping(value="/get/{id}")
	public BaseDto get(@PathVariable Long id) {
		return userService.get(id);
	}
	
}
