package com.demo.oauth.controller;

import com.demo.oauth.bean.User;
import com.demo.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhanglei_yq
 * @date 2019/5/30 17:28
 * @description
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
