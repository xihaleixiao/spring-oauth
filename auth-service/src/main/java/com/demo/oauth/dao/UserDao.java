package com.demo.oauth.dao;

import com.demo.oauth.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanglei_yq
 * @date 2019/5/22 10:50
 * @description
 **/
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String userName);
}
