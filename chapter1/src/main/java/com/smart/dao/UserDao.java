package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 定义访问User的Dao
 * 持久层
 */
@Repository//通过spring注解定义一个dao
public class UserDao {

    @Autowired//自动注入JdbcTemplate的Bean
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password){
        String sqlStr="select count(*) from t_user where user_name=? and password=? ";
        return jdbcTemplate.queryForInt(sqlStr,new Object[]{userName,password});
    }


    public User findUserByUserName(final String userName){
        String sqlstr="select user_id,user_name from t_user where user_name=? ";
        final User user=new User();
        jdbcTemplate.query(sqlstr, new Object[]{userName}, new RowCallbackHandler() {
            //回调函数
            public void processRow(ResultSet rs) throws SQLException {
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
            }
        });
        return user;
    }

    public void updateLoginInfo(User user){
        String sqlstr="update t_user set last_visit=? , last_ip=? where user_id=?";
        jdbcTemplate.update(sqlstr,new Object[]{user.getLastVisit(),user.getLastIp(),user.getUserId()});
    }

    public void changePassword(String username,String password){
        String sqlstr="update t_user set password=? where user_name=? ";
        jdbcTemplate.update(sqlstr,new Object[]{password,username});
    }

    public void registerUser(User user){
        String sqlstr="insert into t_user set user_name=? , password=?";
        jdbcTemplate.update(sqlstr,new Object[]{user.getUserName(),user.getPassword()});
    }
}
