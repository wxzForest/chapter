package com.smart.dao.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

}
