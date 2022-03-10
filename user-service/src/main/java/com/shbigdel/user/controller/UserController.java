package com.shbigdel.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shbigdel.user.entity.User;
import com.shbigdel.user.service.UserService;
import com.shbigdel.user.vo.UserResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping ("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser (@RequestBody User user) {
		log.info("Saving User");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public UserResponseTemplateVO getUserWithGroup (@PathVariable("id") Long userId) {
		log.info("finding user with group");
		return userService.getUserWithGroup(userId);
	}

}
