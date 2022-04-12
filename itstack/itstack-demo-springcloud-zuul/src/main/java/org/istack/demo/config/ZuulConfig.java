package org.istack.demo.config;

import org.istack.demo.router.RouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongxingyi
 * @description TODO 路由配置类
 * @date 2022/4/8 0:11
 */
@Configuration
public class ZuulConfig {
    @Autowired
    private ZuulProperties zuulProperties;
    @Autowired
    private ServerProperties server;

    @Bean
    public RouteLocator routeLocator() {
        return new RouteLocator(this.server.getServlet().getPath(), this.zuulProperties);
    }
}
