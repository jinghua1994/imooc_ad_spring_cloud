package com.imooc.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author jinghua
 * @date 2020年 11月03日 14:45:39
 **/

@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardApplication
{

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class,args);
    }
}
