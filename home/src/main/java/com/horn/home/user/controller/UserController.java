package com.horn.home.user.controller;

import com.horn.home.user.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@Service
@RestController
@RequestMapping("/user/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/index")
    public Object index() {
        return userMapper.getAll();
    }


}
