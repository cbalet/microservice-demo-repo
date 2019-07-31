package com.microEfood.microplat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroPlatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroPlatApplication.class, args);
	}

}
