package com.marvin.WebApp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebAppApplication {

	public static void main(String[] args) {

            SpringApplication.run(WebAppApplication.class, args);
	}

}
