package com.example.chaos.monkey.shopping.bestseller.fashion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {
	
	@Value("${hello.name:none}")
	String name;

	@RequestMapping("/")
	public String index() {
		String str = "Greetings from Spring Boot + Tanzu, " + name;
		return str;
	}
}
