package com.rollingstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@EnableAutoConfiguration
public class RsmortgageConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsmortgageConfigServiceApplication.class, args);
	}
}
