package com.bootdo.clouddobase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.bootdo.*.dao"})
@SpringBootApplication
public class ClouddodoBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClouddodoBaseApplication.class, args);
	}

}
