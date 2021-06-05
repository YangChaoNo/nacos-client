package com.regist.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@NacosPropertySource(dataId = "nacos-test-dev.yml", autoRefreshed = true, groupId = "NACOS-TEST-GROUP")
public class NacosTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosTestApplication.class, args);
    }
}
