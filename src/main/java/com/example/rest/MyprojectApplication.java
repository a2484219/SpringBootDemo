package com.example.rest;

import com.example.annotation.MyAnnotation;
import com.example.biz.TestBiz;
import com.example.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.example.mapper")
@ComponentScan(basePackages = {"com.example.*"})
public class MyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

	@Autowired
	private TestBiz testBiz;

	@MyAnnotation("hello")
	@ResponseBody
	@RequestMapping(value="/home")
	public String home() {
		try {
			System.out.println("111111111111111111");
			User user = testBiz.getUser(1);
			System.out.println(user.getUsername());
			System.out.println(user.getId());
			System.out.println(user.getPassword());
			System.out.println("222222222222222222");
		} catch (Exception e) {
			System.out.println("有异常");
		}
		return "Hello World!";
	}
}
