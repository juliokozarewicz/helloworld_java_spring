package com.juliokozarewicz.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HelloworldApplication {

	public static final String BASE_URL = "/hello-world";

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}