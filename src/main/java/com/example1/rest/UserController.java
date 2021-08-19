package com.example1.rest;

import com.example1.annotation.MyAnnotation;
import com.example1.biz.TestBiz;
import com.example1.entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/25 0025.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private TestBiz testBiz;

    private Logger log = Logger.getLogger(this.getClass());

    private User user;

    @MyAnnotation("hello")
    @ResponseBody
    @RequestMapping(value="/home")
    public String home() {
        try {
            System.out.println("111111111111111111");
            System.out.println("111111111111111111");
            User user = testBiz.getUser(1);
            System.out.println(user.getUsername());
            System.out.println(user.getId());
            System.out.println(user.getPassword());
            System.out.println("222222222222222222");
        } catch (Exception e) {
            log.error("有异常", e);
        }
        return "Hello World!";
    }
}
