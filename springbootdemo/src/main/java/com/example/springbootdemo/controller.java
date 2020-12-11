package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	
@RequestMapping(value="/Message")
	public String welcome() {
		
		return "Welcome";
	}

}
