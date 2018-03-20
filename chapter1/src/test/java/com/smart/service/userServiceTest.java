package com.smart.service;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = ("/applicationContext.xml"))//启动Spring容器
public class userServiceTest extends AbstractTestNGSpringContextTests {//基于TestNg的Spring测试框架

    @Autowired//注入spring的Bean
    private UserService userService;

    @Test
    public void hasMatchUser(){
        boolean b1=userService.hasMatchUser("admin","123456");
        boolean b2=userService.hasMatchUser("admin","11111");
        System.out.println(b1);
        System.out.println(b2);
    }

    @Test
    public void findUserByName(){
        User user=userService.findUserByUserName("admin");
        System.out.println(user.getUserId());
    }
}
