package com.matree.consumer.controller;

import com.matree.consumer.feignClient.ConsumerFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * @author
 * @create 2020-03-21 20:58
 */
@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    private  final DiscoveryClient discoveryClient;

    private final ConsumerFeignClient consumerFeignClient;

    @GetMapping("/test/{str}")
    public String getInstances(@PathVariable String str) {
//        List<ServiceInstance> instances = this.discoveryClient.getInstances("nacos-provider");
//        List<String> targetURLs = instances.stream()
//                .map(instance -> instance.getUri().toString() + "/echo/{1234}")
//                .collect(Collectors.toList());
//        int targetURL = ThreadLocalRandom.current().nextInt(targetURLs.size());
//        log.info("url = {}", targetURLs.get(targetURL));
//        String str = restTemplate.getForObject(
//                "http://nacos-provider/echo/{str}",
//                String.class, "1234"
//        );
        return consumerFeignClient.echo(str);

    }
}
