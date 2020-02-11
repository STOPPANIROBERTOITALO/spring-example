package it.rs.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController
{
	@GetMapping("/description")
	String getMyName()
	{
		return "Example Spring Boot Application";
	}
}
