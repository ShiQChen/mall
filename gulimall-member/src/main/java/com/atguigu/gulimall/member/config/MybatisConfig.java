package com.atguigu.gulimall.member.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/5/3 15:43
 */

@Configuration
@EnableTransactionManagement
@MapperScan("com.atguigu.gulimall.product.dao")
public class MybatisConfig {
    // 引入分页
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最后页后操作，true 调回到首页，false 继续请求，默认 false
        paginationInterceptor.setOverflow(true);
        // 设置最大单页限制数量，默认500 条，-1 不受限制
        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }
}
