package com.ust.Caseserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CaseserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseserverApplication.class, args);
	}

}
