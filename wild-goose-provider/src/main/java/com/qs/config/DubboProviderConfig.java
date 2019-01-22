package com.qs.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dubbo服务提供者配置
 *
 * @author FBin
 * @time 2019/1/22 7:31
 */
@Configuration
@DubboComponentScan(basePackages = "com.qs.service")
public class DubboProviderConfig {

    @Bean("dubbo-annotation-provider")
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-test");
        applicationConfig.setId("provider-test");
        return applicationConfig;
    }

    @Bean("my-registry")
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("redis://127.0.0.1:6379");
        return registryConfig;
    }

    /**
     * 当前连接注册中心配置
     */
    @Bean("dubbo")
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(12345);
        return protocolConfig;
    }

}
