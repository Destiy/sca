package com.matree.consumer.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author
 * @create 2020-03-22 21:43
 */
public class ConsumerFeignConfiguration {

    @Bean
    Logger.Level level(){
        return Logger.Level.FULL;
    }
}
