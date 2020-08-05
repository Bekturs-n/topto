package com.mn.topto.webapp.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mn.topto")
@EntityScan("com.mn.topto.models.entity")
public class ToptoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToptoApplication.class, args);
	}
}
