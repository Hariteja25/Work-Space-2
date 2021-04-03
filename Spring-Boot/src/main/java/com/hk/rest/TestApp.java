package com.hk.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.dto.Employee;




//hai how are you

@SpringBootApplication
//@ComponentScan(basePackages ={"rest "})
public class TestApp {
	private static final Logger logger = LoggerFactory.getLogger(TestApp.class);

	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
		
	}
}

  