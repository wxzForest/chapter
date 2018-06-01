package com.smart.dao;

import com.zbj.zop.gateway.AppConfig;
import com.zbj.zop.gateway.ZopAnnotationBean;
import org.springframework.context.annotation.Bean;

public class OpenBean {

    @Bean
    public ZopAnnotationBean zopAnnotationBean(){
        AppConfig config=new AppConfig("2016121309583430P542","BBA3FD5C1180A8FADDA0D5B14F27C338","test");
        return new ZopAnnotationBean(config);
    }
}
