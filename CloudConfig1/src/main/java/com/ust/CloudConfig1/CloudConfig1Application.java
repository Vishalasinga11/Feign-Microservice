package com.ust.CloudConfig1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer


public class CloudConfig1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfig1Application.class, args);
	}

}
