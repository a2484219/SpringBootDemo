package com.example.interceptor;

import com.example.annotation.MyAnnotation;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/12/12 0012.
 */
public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //DispatcherServlet所处理的方法
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        Method method = handlerMethod.getMethod();
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);
        if(annotation == null) {
            System.out.println("55555555555");
        }else {
            System.out.println(annotation.value());
            System.out.println("6666666666");
        }
        System.out.println("在请求处理之前进行调用");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("333333333333");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
