package com.malu.springboot.configurationlog;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConfigurationLogApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void testLog() {

      logger.trace("this is trace");
      logger.info("this is info");
      logger.debug("this is debug");
      logger.warn("this is warn");
      logger.error("this is error");


    }


}
