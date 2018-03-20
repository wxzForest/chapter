package com.smart.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.smart.Car;

public class BeanFactoryTest {
    public static void main(String[] args) throws Throwable{
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //默认读取的是resource目录下的文件
        Resource res = resolver.getResource("classpath:com/smart/beanfactory/beans.xml");
        System.out.println(res.getURL());
        BeanFactory bf = new XmlBeanFactory(res);
        System.out.println("init BeanFactory.");

        Car car = bf.getBean("car",Car.class);
        System.out.println(car.toString());
    }
}