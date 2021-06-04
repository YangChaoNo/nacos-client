package com.personal.project.config;


import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

/**
 * Copyright ©  2021-2021 陕西博尔康软件科技有限公司. All rights reserved.
 * 功能/ 模块：
 *
 * @author yc
 * @version 1.0.0
 * 类描述：
 * 修订历史：
 * 日期：2021-06-04-19:52
 */
@Configuration
public class NacosConfig {
    @Value("${server.port}")
    private int serverPort;
    @Value("${spring.application.name}")
    private String applicationName;

    @NacosInjected
    private NamingService namingService;

    @PostConstruct
    public void registerInstance() throws NacosException {
        namingService.registerInstance(applicationName, "127.0.0.1", serverPort);
    }
}