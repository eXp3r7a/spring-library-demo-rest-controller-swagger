package com.example.spring_rest_controller_swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Library", description = "Library with RESTAPI Controllers"))
public class SpringRestControllerSwaggerApplication {

	private static final Logger logger = LogManager.getLogger(SpringRestControllerSwaggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRestControllerSwaggerApplication.class, args);

		logger.trace("1.This is a TRACE message.");
		logger.debug("2.This is a DEBUG message.");
		logger.info("3.This is an INFO message.");
		logger.warn("4.This is a WARN message.");
		logger.error("5.This is an ERROR message.");
	}

}
