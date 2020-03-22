package com.matree.ribbon.configuration;

import com.matree.consumer.configuration.NaCosSameClusterWeightedRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @create 2020-03-22 14:30
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        return new NaCosSameClusterWeightedRule();
    }

//    @Bean
//    public IPing pingRule(){
//        return new PingUrl();
//    }
}
