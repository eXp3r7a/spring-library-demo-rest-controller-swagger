package com.example.spring_rest_controller_swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Library", description = "Library with RESTAPI Controllers"))
public class SpringRestControllerSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestControllerSwaggerApplication.class, args);
	}

}
