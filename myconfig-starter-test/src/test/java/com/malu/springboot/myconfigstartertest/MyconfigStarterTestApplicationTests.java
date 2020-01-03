package com.malu.springboot.myconfigstartertest;

import com.malu.springboot.myconfigautoconfiguration.HelloMyConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyconfigStarterTestApplicationTests {

	@Autowired
	HelloMyConfiguration helloMyConfiguration;

	@Test
	void testMyconfigspringBootStarter() {

		String malu = helloMyConfiguration.sayHi("malu");
		System.out.println(malu);
	}

}
