package com.js.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories
public class JsRestApiApplication extends SpringBootServletInitializer {

	 @Override
    	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
       	 return application.sources(JsRestApiApplication.class);
   	}
	
	public static void main(String[] args) {
		SpringApplication.run(JsRestApiApplication.class, args);
	}

}
