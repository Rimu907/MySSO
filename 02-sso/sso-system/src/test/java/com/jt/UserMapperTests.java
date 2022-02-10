package com.jt;

import com.jt.system.dao.UserMapper;
import com.jt.system.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Date:2022/2/10 13:05
 * @Author:NANDI_GUO
 */
@SpringBootTest
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelectUserByUsername(){
        User user =
                userMapper.selectUserByUsername("admin");
        System.out.println(user);
    }
    @Test
    void testSelectUserPermissions(){
        List<String> permission=
                userMapper.selectUserPermissions(1L);
        System.out.println(permission);
    }
}
