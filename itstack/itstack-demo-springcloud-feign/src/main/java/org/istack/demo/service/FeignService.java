package org.istack.demo.service;

import org.istack.demo.service.hystrix.FeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hongxingyi
 * @description TODO
 * @date 2022/4/6 16:26
 */
//hystrix熔断，增加一个fallback = FeignServiceHystrix.class 配置
//feign使用注解的方式注明调用client实例，比ribbon方便一点
@FeignClient(value = "itstack-demo-springcloud-eureka-client",fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "/api/queryUserInfo", method = RequestMethod.GET)
    String queryUserInfo(@RequestParam String userId);
}
