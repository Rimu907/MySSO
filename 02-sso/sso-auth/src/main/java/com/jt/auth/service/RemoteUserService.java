package com.jt.auth.service;

import com.jt.auth.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Date:2022/2/10 13:45
 * @Author:NANDI_GUO
 */
@FeignClient(value = "sso-system", contextId = "remoteUserService")
public interface RemoteUserService {
    @GetMapping("/user/login/{username}")
    User selectUserByUsername(@PathVariable String username);

    @GetMapping("/user/permission/{userId}")
    List<String> selectUserPermissions(@PathVariable Long userId);

}
