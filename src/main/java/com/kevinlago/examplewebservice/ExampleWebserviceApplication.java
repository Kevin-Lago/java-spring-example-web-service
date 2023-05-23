package com.kevinlago.examplewebservice;

import com.kevinlago.examplewebservice.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ExampleWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleWebserviceApplication.class, args);
	}

}
