package com.smart.context;

import com.smart.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationApplicationContext {

    public static void main(String[] args){
        ApplicationContext app=new AnnotationConfigApplicationContext(Beans.class);
        Car car=app.getBean("car",Car.class);

        System.out.println(car.getColor());
    }
}
