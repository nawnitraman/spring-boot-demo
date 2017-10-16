package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<Users> returnUsers()
	{
		return Arrays.asList(
			new Users("Dough","Richter",54),
			new Users("Walter","Dolan",37),
			new Users("Bob","Wolfe",49)				
		);
	}
	
}
