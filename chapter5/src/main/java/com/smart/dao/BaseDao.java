package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;


    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }
}
