package com.example1.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/12/12 0012.
 */
@Configuration
public class MyInterceptor extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/user/**");  //对来自/user/** 这个链接来的请求进行拦截
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}
