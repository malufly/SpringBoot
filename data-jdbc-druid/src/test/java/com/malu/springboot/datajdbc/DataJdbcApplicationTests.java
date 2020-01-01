package com.malu.springboot.datajdbc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest
class DataJdbcApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DataSource dataSource;

    @Test
    void jdbcConnection() throws SQLException {

        Connection connection = dataSource.getConnection();
        Assert.assertNotNull("connection is exsit",connection);
        logger.info("获取的连接为：" + connection.toString());
        connection.close();

    }

}
