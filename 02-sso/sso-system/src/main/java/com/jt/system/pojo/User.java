package com.jt.system.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date:2022/2/10 13:01
 * @Author:NANDI_GUO
 */
/*
* 封装用户信息
* */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 4831304712151465443L;
    private Long id;
    private String username;
    private String password;
    private String status;
}
