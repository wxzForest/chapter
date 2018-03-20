package com.smart.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringAdviceTest {

    @Test
    public void testAdvice(){
        String configPath="com/smart/advice/beans.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(configPath);
        Waiter waiter= (Waiter) app.getBean("waiter");
        waiter.greeTo("小丽");
        waiter.serveTo("小芳");
    }
}
