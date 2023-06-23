package com.example.chaos.monkey.shopping.bestseller.toys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String str = "Greetings from Spring Boot + Tanzu!!";
		return str;
	}

}
