package com.example.demo;

import org.springframework.context.annotation.*;

@Configuration
public class SpringConfig {
	@Bean
	public HelloService hello() {
		return new HelloService();
	}
}
