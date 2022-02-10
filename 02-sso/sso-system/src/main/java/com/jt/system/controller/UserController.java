package com.jt.system.controller;

import com.jt.system.pojo.User;
import com.jt.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date:2022/2/10 13:16
 * @Author:NANDI_GUO
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login/{username}")
    public User doSelectUser(@PathVariable String username){
        return userService.selectUserByUsername(username);
    }

    @GetMapping("/permission/{userId}")
    public List<String> doSelectUserPermissions(@PathVariable Long userId){
        return userService.selectUserPermissions(userId);
    }
}
