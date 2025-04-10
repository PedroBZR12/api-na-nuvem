package me.dio.api_na_nuvem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class ApiNaNuvemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNaNuvemApplication.class, args);
	}

}
