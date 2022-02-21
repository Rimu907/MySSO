package com.jt.auth.pojo;

import lombok.Data;
import java.io.Serializable;


/**
 * @Date:2022/2/10 13:42
 * @Author:NANDI_GUO
 */

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 4831304712151465443L;
    private Long id;
    private String username;
    private String password;
    private String status;
}
