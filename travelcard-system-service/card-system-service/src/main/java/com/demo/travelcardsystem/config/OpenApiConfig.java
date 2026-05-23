package com.demo.travelcardsystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Al Naqel Fare Card System API")
                        .version("1.0")
                        .description("Interactive REST API documentation for the UAE Travel Card Management System.")
                        .contact(new Contact()
                                .name("Mustabir Islam")
                                .email("themuhit@gmail.com")));
    }
}