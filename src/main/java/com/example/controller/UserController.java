package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService service;
	
	//@CrossOrigin(origins = "http://192.168.131.85:8080")
	@RequestMapping("/all")
	public List<User> getUser(){
		List<User> list = service.getAll();
		logger.info(list.toString());
		return list;
	}
}
