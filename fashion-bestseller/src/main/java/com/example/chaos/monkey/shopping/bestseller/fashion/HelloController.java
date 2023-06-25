package com.example.chaos.monkey.shopping.bestseller.fashion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {
	
	@Value("${cook.special:none}")
	String special;

	@RequestMapping("/")
	public String index() {
		String str = "Greetings from Spring Boot + Tanzu!!" + special;
		return str;
	}

}
