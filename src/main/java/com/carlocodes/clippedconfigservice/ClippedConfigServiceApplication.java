package com.carlocodes.clippedconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ClippedConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClippedConfigServiceApplication.class, args);
	}

}
