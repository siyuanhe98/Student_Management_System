package com.example.shiro_mysql_integrate.dao;

import com.example.shiro_mysql_integrate.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Siyuan He
 * @create 2022-05-26 10:03 PM
 */
public interface UserDao extends CrudRepository<User, Long> {

    public User findUserByUsername(String username);
}
