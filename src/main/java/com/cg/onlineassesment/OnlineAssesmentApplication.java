package com.cg.onlineassesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

//@ComponentScan(basePackages = {"com.cg.matrimony"})
public class OnlineAssesmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineAssesmentApplication.class, args);
	}

}
