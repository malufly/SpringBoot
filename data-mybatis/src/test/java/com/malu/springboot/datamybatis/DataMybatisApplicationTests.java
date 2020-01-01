package com.malu.springboot.datamybatis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


@RunWith(SpringRunner.class)
@SpringBootTest
class DataMybatisApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DataSource dataSource;

    @Test
    void testDruid() {

        logger.info("datasource:" + dataSource );

    }

}
