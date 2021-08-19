package com.example1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.example1.mapper")
@ComponentScan(basePackages = {"com.example1.*"})
@Configuration
@ImportResource(locations = "classpath*:/spring-applicationContext.xml")
@SpringBootConfiguration
@EnableAutoConfiguration
public class MyprojectApplication {

    /*@Bean
	public User getUser(){
        return new User();
    }*/

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}
}
