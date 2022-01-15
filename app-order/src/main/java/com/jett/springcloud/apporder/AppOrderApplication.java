package com.jett.springcloud.apporder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient  // 开启eureka客户端模式
@EnableFeignClients //开启feign请求
@MapperScan("com.jett.springcloud.apporder.mapper") // mybatis扫描

public class AppOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOrderApplication.class, args);
	}

}
