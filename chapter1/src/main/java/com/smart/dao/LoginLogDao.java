package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 定义访问LoginLog的Dao
 * 持久层
 */
@Repository//通过Spring注解定义一个dao
public class LoginLogDao {

    @Autowired//自动注入jdbcTemplate的bean
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog log){
        String sqlstr="insert into t_login_log (user_id,ip,login_datetime) values (?,?,?)";
        Object args[]={log.getUserId(),log.getIp(),log.getLoginDate()};
        jdbcTemplate.update(sqlstr,args);
    }
}
