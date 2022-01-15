package com.jett.springcloud.appstorage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jett.springcloud.appstorage.mapper")
public class AppStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppStorageApplication.class, args);
	}

}
