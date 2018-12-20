package com.javatechie.spring.jenkin.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinApplicationTests {


	Logger logger=LoggerFactory.getLogger(SpringJenkinApplicationTests.class);
	@Test
	public  contextLoads() {
		logger.info("Executing test package...");
		assertEquals(true, true);
	}

}

