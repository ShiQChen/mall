package com.atguigu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/4/25 14:58
 */

@EnableTransactionManagement
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.atguigu.gulimall.ware.dao")
public class GulimallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }
}
