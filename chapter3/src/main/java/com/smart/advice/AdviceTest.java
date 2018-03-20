package com.smart.advice;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdviceTest {

    private Waiter target;

    private Advice advice;

    private ProxyFactory pf;

    @BeforeTest
    public void init(){
        target=new NaiveWaiter();

        advice=new GreetingAdvice();
        //spring提供的代理工厂
        pf=new ProxyFactory();
        //设置代理目标
        pf.setTarget(target);
        //为代理目标添加增强
        pf.addAdvice(advice);
    }

    @Test
    public void beforeAdvice(){
        Waiter proxy= (Waiter) pf.getProxy();
        proxy.greeTo("小红");
        proxy.serveTo("小妹");
    }
}
