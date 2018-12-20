package com.javatechie.spring.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {
	
	Logger logger=LoggerFactory.getLogger(SpringJenkinApplication.class);
	
	@PostConstruct
	public void test() {
		logger.info("job runner started");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}

