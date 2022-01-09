package com.xk.myeasyblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xk.myeasyblog.mapper"})
public class MyEasyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEasyBlogApplication.class, args);
    }

}
