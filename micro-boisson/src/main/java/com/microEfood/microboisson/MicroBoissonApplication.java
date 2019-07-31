package com.microEfood.microboisson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroBoissonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroBoissonApplication.class, args);
	}

}
