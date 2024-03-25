/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.celulares.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.microservicios.celulares.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(getApiInfo())
        ;
    }

    private ApiInfo getApiInfo  (){
        return new ApiInfo(
            "celulares", 
            "servicio para venta de celulares",
            "0.0.1",
            "TOS",
            new Contact("Arturo Vazquez", "http://localhost:8081", "myemail@example.com"),
            "MIT",
            "None",
                Collections.emptyList());
    }
    
}
