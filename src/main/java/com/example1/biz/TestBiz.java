package com.example1.biz;

import com.example1.entity.User;
import com.example1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
@Service("testBiz")
public class TestBiz {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private User user;

    @Transactional
    public User getUser(Integer id) {
        System.out.println("getUser方法开始");
        user.setId(1);
        user.setUsername("jack");
        user.setPassword("123456");
        user.setPassword("222222222");
        userMapper.updateByPrimaryKey(user);
//        int a = 1/0;
        return userMapper.selectByPrimaryKey(id)==null?user:userMapper.selectByPrimaryKey(id);
    }
}
