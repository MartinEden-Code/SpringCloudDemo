package org.istack.demo.service.hystrix;

import org.istack.demo.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author hongxingyi
 * @description TODO
 * @date 2022/4/7 13:39
 */
@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String queryUserInfo(String userId) {
        //熔断保护
        return "queryUserInfo by userId：" + userId + " err！from feign hystrix";
    }
}
