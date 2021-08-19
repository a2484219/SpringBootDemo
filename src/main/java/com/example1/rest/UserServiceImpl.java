package com.example1.rest;


/**
 * Created by Administrator on 2018/7/17 0017.
 */
public class UserServiceImpl implements UserServiceBo {

    @Override
    public String sayHello(String name) {
        //让当前当前线程休眠2s
        try {
            System.out.println("调用成功，我是" + name);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public String testPojo(Person person) {
        //让当前当前线程休眠2s
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return person.toString();
    }
}
