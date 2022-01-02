package com.xk.myeasyblog.config;

import com.xk.myeasyblog.filter.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 手动注册自定义的过滤器
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean registerAuthFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CorsFilter());
        registration.addUrlPatterns("/*");
        registration.setName("corsFilter");//手动注册进去
        registration.setOrder(1);  //值越小，Filter越靠前。
        return registration;
    }
}
