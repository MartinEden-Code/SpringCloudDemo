package org.istack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author hongxingyi
 * @description TODO
 * @date 2022/4/7 14:02
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardApplication {

    public static void main(String[] args){
        SpringApplication.run(DashboardApplication.class,args);
    }

}
