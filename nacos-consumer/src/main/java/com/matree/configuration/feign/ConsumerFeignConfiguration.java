package com.matree.configuration.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @create 2020-03-22 21:43
 */
@Configuration
public class ConsumerFeignConfiguration {

    @Bean
    Logger.Level level() {
        return Logger.Level.FULL;
    }
}
