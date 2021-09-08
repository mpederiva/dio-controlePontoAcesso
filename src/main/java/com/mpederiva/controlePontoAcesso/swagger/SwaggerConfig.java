package com.mpederiva.controlePontoAcesso.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mpederiva.controlepontoacesso"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(
                        Collections.singletonList(
                                new ParameterBuilder()
                                        .name("ControlePontoAcesso")
                                        .description("Controle de Ponto de Acesso")
                                        .modelRef(new ModelRef("string"))
                                        .parameterType("header")
                                        .required(false)
                                        .build()));

    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API-REST")
                .description("API para gerenciamento de controle de ponto e acesso")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Marta Pederiva", "https://github.com/mpederiva/dio-controlePontoAcesso"))
                .build();
    }
}
