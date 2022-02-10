package com.jt;

import org.apache.ibatis.jdbc.SQL;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Date:2022/2/10 12:56
 * @Author:NANDI_GUO
 */
@SpringBootTest
public class DataSourceTests {
    @Autowired
    private DataSource dataSource;

    @Test
    void TestGetConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println("数据库连接成功");
    }
}
