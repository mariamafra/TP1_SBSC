package com.example.TP1_SBSC_SERVER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Tp1SbscServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1SbscServerApplication.class, args);
	}

}
