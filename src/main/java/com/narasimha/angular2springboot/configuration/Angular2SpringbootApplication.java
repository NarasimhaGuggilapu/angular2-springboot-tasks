package com.narasimha.angular2springboot.configuration;

import com.narasimha.angular2springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(ApplicationDataSourceConfiguration.class)
@SpringBootApplication
public class Angular2SpringbootApplication  {

	public static void main(String[] args) {
		SpringApplication.run(Angular2SpringbootApplication.class, args);
	}

}
