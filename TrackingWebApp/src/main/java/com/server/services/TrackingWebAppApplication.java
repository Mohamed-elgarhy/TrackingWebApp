package com.server.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrackingWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackingWebAppApplication.class, args);
	}
}
