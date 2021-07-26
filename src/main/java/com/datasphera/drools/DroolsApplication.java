package com.datasphera.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsApplication.class, args);
	}

}
