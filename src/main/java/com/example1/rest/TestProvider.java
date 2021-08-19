package com.example1.rest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/7/17 0017.
 */
public class TestProvider {
    public static void main(String[] arg) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        System.out.println("=======================" + Thread.currentThread());
        //挂起当前线程，如果没有改行代码，服务提供者进程会消亡，服务消费者就发现不了提供者了
        Thread.currentThread().join();
    }
}
