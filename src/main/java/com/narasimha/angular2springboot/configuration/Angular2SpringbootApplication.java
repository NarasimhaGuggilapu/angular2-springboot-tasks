package com.narasimha.angular2springboot.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(ApplicationDataSourceConfiguration.class)
@ComponentScan(basePackages = {"com.narasimha.angular2springboot"})
@SpringBootApplication
public class Angular2SpringbootApplication  {

	public static void main(String[] args) {
		SpringApplication.run(Angular2SpringbootApplication.class, args);
	}

}
