package org.istack.demo;

import org.istack.demo.filter.TokenFilter;
import org.istack.demo.service.RefreshRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author hongxingyi
 * @description TODO
 * @date 2022/4/8 0:06
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    //动态路由与权限过滤器
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    @Autowired
    private RefreshRouteService refreshRouteService;
    @Autowired
    private ZuulHandlerMapping zuulHandlerMapping;

    @RequestMapping("api/refresh")
    public String refresh(){
        refreshRouteService.refreshRoute();
        return "success";
    }

    @RequestMapping("api/queryRouteInfo")
    @ResponseBody
    public Map<String, Object> queryRouteInfo(){
        return zuulHandlerMapping.getHandlerMap();
    }
}
