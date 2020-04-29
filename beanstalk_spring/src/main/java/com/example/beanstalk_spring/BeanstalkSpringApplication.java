package com.example.beanstalk_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BeanstalkSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanstalkSpringApplication.class, args);
	}

	@RequestMapping(value = "/getVal", method = RequestMethod.GET, produces = ("text/html"))
	public String getVal() {
		return "hello  from narayan";
	}

}
