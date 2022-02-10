package com.jt.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.system.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 90730
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 基于用户名获取用户信息
     * @param username
     * @return
     */
    @Select("select id,username,password,status " +
            "from tb_users " +
            "where username=#{username}")
    User selectUserByUsername(String username);

    /**
     * 基于用户id查询用户权限
     * @param userId 用户id
     * @return 用户的权限
     * 涉及到的表:tb_user_roles,tb_role_menus,tb_menus
     */
    @Select("select distinct m.permission " +
            "from tb_user_roles ur join tb_role_menus rm on ur.role_id=rm.role_id" +
            "     join tb_menus m on rm.menu_id=m.id " +
            "where ur.user_id=#{userId}")
    List<String> selectUserPermissions(Long userId);

}
