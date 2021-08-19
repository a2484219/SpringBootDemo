package com.example1.parser;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by Administrator on 2018/11/25 0025.
 * 目的是将组件注册到Spring容器中
 */
public class UserNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserParser());
    }
}
