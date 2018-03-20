package com.smart.context;

import com.smart.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//表示一个配置信息提供类
public class Beans {

    @Bean(name = "car")//定义一个bean
    public Car buildCar(){
        Car car=new Car();
        car.setBrand("wxz");
        car.setColor("绿色");
        return car;
    }
}
