package com.guihx;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(value = "com.guihx.mapper")
@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.guihx",exclude = DruidDataSourceAutoConfigure.class)
public class TwoDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoDataSourceApplication.class, args);
    }

}
