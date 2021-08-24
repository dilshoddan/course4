package com.course4.userserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServApplication.class, args);
	}

}
