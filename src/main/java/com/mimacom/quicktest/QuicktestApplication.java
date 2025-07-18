package com.mimacom.quicktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class QuicktestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuicktestApplication.class, args);
	}

}
