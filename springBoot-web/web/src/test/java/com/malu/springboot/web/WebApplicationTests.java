package com.malu.springboot.web;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
class WebApplicationTests {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DataSource dataSource;

	@Test
	void testDataSource() throws SQLException {

		Connection connection = dataSource.getConnection();
		Assert.notNull(connection,"database connection should not be null");

		logger.info(dataSource + "" + dataSource.getClass().toString());

	}

}
