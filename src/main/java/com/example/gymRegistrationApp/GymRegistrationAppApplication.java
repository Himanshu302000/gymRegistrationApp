package com.example.gymRegistrationApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
public class GymRegistrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymRegistrationAppApplication.class, args);
	}

}
