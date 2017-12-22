package com.example.biz;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
@Service("testBiz")
public class TestBiz {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User getUser(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("jack");
        user.setPassword("123456");
        userMapper.updateByPrimaryKey(user);
//        int a = 1/0;
        return userMapper.selectByPrimaryKey(id);
    }
}
