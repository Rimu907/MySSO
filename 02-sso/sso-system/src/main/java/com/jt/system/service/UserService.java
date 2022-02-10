package com.jt.system.service;

import com.jt.system.pojo.User;

import java.util.List;

/**
 * @Date:2022/2/10 13:11
 * @Author:NANDI_GUO
 */
public interface UserService {
    User selectUserByUsername(String username);
    List<String> selectUserPermissions(Long userId);
}
