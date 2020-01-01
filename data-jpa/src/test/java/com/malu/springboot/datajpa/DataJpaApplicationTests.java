package com.malu.springboot.datajpa;

import com.malu.springboot.datajpa.pojo.User;
import com.malu.springboot.datajpa.reponsity.UserReponsity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class DataJpaApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DataSource dataSource;

    @Resource
    UserReponsity userReposity;


    @Test
    void testDataSource() {

        logger.info("datasource:" + dataSource);

    }

    @Test
    void testReposity(){

        Assert.notNull(userReposity,"userResponity could not be null");
        logger.info("userReposity:" + userReposity);
    }

    @Test
    void testUserReposityCurd(){

        User userone = new User(1, "test1", 2);
        User user3 = new User(1, "test1111", 2);
        User usertwo = new User(2, "test2", 2);

        User save = userReposity.save(userone);
        User one = userReposity.getOne(1);
//		logger.info("userReposity添加第一次" + one); //不能使用 变量one 因为没有用saveandFlush值在内存中无法获取变量。
        User user = userReposity.saveAndFlush(usertwo);
        List<User> all = userReposity.findAll();
        logger.info("show all:" + all);

        ArrayList<User> users1 = new ArrayList<>();
        users1.add(usertwo);
        users1.add(user3);
        userReposity.saveAll(users1);
        List<User> all1 = userReposity.findAll();
        logger.info("saveAll():" + all1 );
        userReposity.deleteAll();
        List<User> all2 = userReposity.findAll();
        logger.info("deleteAll():" + all1 );


    }



}
