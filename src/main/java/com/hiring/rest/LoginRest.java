package com.hiring.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiring.entity.User;

@RestController
@RequestMapping("/validate")
public class LoginRest {
	
	
	
    @PostMapping
    public void validateUser(@RequestBody User user) {
    }
 
}
