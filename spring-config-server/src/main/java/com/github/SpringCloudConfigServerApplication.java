package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	public static void main(String[] arg) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, arg);
	}

}
