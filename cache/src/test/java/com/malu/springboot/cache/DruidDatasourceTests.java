package com.malu.springboot.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 3:56 下午
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class DruidDatasourceTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DataSource dataSource;

    @Test
    public void testDatasource(){

        Assert.notNull(dataSource,"druidDatasource Should not be null");
        logger.info("dataSource:" + dataSource + dataSource.toString());
    }

    @Test
    public void testConnection() {

        try {
            Connection connection = dataSource.getConnection();
            Assert.notNull(connection,"connetion should not be null");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
