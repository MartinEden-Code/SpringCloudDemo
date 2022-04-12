package org.istack.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


/**
 * @author hongxingyi
 * @description TODO  配置获取客户端方，提供自动刷新Http
 * @date 2022/4/7 16:36
 */
@RestController
@RefreshScope //自动刷新注解配置
public class ConfigClientController {
    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/config")
    public Mono<String> config() {
        return Mono.justOrEmpty(profile);
    }


}
