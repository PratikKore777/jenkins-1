package com.example.jenkins1;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins1Application {

	public static Logger logger = LoggerFactory.getLogger(Jenkins1Application.class);

	@PostConstruct
	public void initt(){
		logger.info("Application running.....");
	}

	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(Jenkins1Application.class, args);
	}

}
