package com.Lloren.Lloren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Lloren")
public class LlorenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LlorenApplication.class, args);
	}

}
