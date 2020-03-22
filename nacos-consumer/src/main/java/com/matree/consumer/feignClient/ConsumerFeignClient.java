package com.matree.consumer.feignClient;

import com.matree.consumer.configuration.ConsumerFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author
 * @create 2020-03-22 20:50
 */
@FeignClient(name = "nacos-provider", configuration = ConsumerFeignConfiguration.class)
//@FeignClient(name = "nacos-provider")
public interface ConsumerFeignClient {

    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);
}
