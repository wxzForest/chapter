package com.smart.dao.hibernate;

import com.smart.dao.BaseDao;
import com.smart.domain.ViewSpace;

public class ViewSpaceHibernateDao extends BaseDao {

    public void addViewSpace(ViewSpace viewSpace){
        getHibernateTemplate().save(viewSpace);
    }
}
