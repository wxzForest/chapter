package com.smart.web;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller//标注成为SpringMVC的controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registerPage.html")
    public ModelAndView registerPage(){
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/register.html")
    public ModelAndView registerUser(HttpServletRequest request, User user){
        System.out.println(user.getUserName());
        User user1=userService.findUserByUserName(user.getUserName());
        System.out.println(user1.getUserName());
        System.out.println(user1);
        if(user1.getUserName()!=null){
            return new ModelAndView("register","error2","用户已经被注册了！");
        } else {
            userService.registUser(user);
            return new ModelAndView("login");
        }
    }
}
