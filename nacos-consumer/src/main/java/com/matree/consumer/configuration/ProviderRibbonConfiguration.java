package com.matree.consumer.configuration;

import com.matree.ribbon.configuration.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

/**
 * 代码方式 配置ribbon 负载规则
 *
 * @author
 * @create 2020-03-22 14:31
 */
@Configuration
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class ProviderRibbonConfiguration {
}
