package com.ace.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Bean
    // @Profile("!default")
    // public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
    // EurekaInstanceConfigBean b = new EurekaInstanceConfigBean(inetUtils);
    // AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
    // b.setDataCenterInfo(info);
    // return b;
    // }

}
