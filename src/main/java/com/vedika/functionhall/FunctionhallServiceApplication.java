package com.vedika.functionhall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.vedika.functionhall")

public class FunctionhallServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionhallServiceApplication.class, args);
	}

}
