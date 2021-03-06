package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.remote.HelloRemote;

@RestController
public class ConsumerController {
	
	@Autowired
	HelloRemote helloRemote;
	
	@RequestMapping("/hello1/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}

}
