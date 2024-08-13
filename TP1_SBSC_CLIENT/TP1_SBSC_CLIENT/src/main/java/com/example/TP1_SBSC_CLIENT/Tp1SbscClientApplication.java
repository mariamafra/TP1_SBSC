package com.example.TP1_SBSC_CLIENT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tp1SbscClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1SbscClientApplication.class, args);
	}

}
