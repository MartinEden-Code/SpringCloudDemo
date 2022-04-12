package org.istack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author hongxingyi
 * @description TODO
 * @date 2022/4/7 15:02
 */
@EnableTurbine
@SpringBootApplication
public class TurbineApplication {
    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class,args);
    }
}
