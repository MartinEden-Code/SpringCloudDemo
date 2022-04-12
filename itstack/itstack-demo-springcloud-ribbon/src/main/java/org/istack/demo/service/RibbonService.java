package org.istack.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hongxingyi
 * @description TODO
 * @date 2022/4/6 16:26
 */
@Service
public class RibbonService {

    //rest模版，用于Ribbon接口调用。
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "queryUserInfoFallback")
    public String queryUserInfo(String userId) {
        return restTemplate.getForObject("http://ITSTACK-DEMO-SPRINGCLOUD-EUREKA-CLIENT/api/queryUserInfo?userId=" + userId, String.class);
    }

    public String queryUserInfoFallback(String userId){
        return  "queryUserInfo by userId：" + userId + " err！from ribbon hystrix";
    }

}
