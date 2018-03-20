package com.smart.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreetingAdvice implements MethodBeforeAdvice,AfterReturningAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName=(String) args[0];
        System.out.println("how are you!"+clientName);
    }
    //在目标方法调用后执行
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("please enjoy yourself!"+args[0]);
    }
}
