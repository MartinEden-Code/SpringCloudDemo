package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		System.out.println("创建dev分支");
		System.out.println("创建test分支");
	}
}
