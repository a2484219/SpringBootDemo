package com.example1.parser;

import com.example1.entity.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * Created by Administrator on 2018/11/25 0025.
 * 根本上来说，是实现了BeanDefinitionParser
 *
 * 用来解析XSD文件中的定义和组件定义
 */
public class UserParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String idStr = element.getAttribute("id");
        Integer id = Integer.parseInt(idStr);
        String userName = element.getAttribute("username");
        String password = element.getAttribute("password");
        if(StringUtils.hasText(idStr)) {
            builder.addPropertyValue("id", id);
        }
        if(StringUtils.hasText(userName)){
            builder.addPropertyValue("username", userName);
        }
        if(StringUtils.hasText(password)){
            builder.addPropertyValue("password", password);
        }
    }
}
