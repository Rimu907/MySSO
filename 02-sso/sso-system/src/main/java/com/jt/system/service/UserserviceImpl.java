package com.jt.system.service;

import com.jt.system.dao.UserMapper;
import com.jt.system.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date:2022/2/10 13:13
 * @Author:NANDI_GUO
 */
@Service
public class UserserviceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByUsername(String username) {
        User user = userMapper.selectUserByUsername(username);
        return user;
    }

    @Override
    public List<String> selectUserPermissions(Long userId) {
        List<String> permissions = userMapper.selectUserPermissions(userId);
        return permissions;
    }
}
