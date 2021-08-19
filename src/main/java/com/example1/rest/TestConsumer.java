package com.example1.rest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/7/17 0017.
 */
public class TestConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:consumer.xml" });

        final UserServiceBo demoService = (UserServiceBo) context.getBean("userService");

        System.out.println(demoService.sayHello("哈哈哈"));
    }
}
