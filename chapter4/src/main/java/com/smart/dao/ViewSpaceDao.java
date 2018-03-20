package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ViewSpaceDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void initJDBC(){
        String sql="create table t_test (t_id int primary key,t_name varchar(60))";
        jdbcTemplate.execute(sql);
    }
}

