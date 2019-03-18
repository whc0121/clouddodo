package com.nancal.clouddodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ClouddodoServer7001Application {

	public static void main(String[] args) {
		SpringApplication.run(ClouddodoServer7001Application.class, args);
	}

}
