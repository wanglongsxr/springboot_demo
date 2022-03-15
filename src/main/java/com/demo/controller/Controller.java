package com.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "demo/v1/")
public class Controller {

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(@RequestParam(value = "name", required = false) String name) {
		if(name==null){
			name = "friend";
		}
		return String.format("Hello %s ! Glad to see you !", name);

	}
}
