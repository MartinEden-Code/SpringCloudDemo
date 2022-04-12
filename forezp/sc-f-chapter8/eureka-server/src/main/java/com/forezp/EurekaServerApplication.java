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
		//SpringApplication.run(EurekaServerApplication.class, args);
		Map<String,Object> map = new HashMap<>(10);
		map.put("12",12);
		map.put("13",13);
		for(String key :map.keySet()){
			System.out.println(key);
			//map.put("14",14);
		}
	}
}
