package com.capgemini.Safaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SafaarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafaarApplication.class, args);
	}
}
