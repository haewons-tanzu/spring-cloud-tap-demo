package com.example.chaos.monkey.shopping.bestseller.fashion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
