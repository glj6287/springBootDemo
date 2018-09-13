package com.winter.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@Configuration
@EnableSwagger2
//http://localhost:8081/swagger-ui.html
public class Swagger2Config {
    /**
     * UI页面显示信息
     */
    private final String SWAGGER2_API_BASEPACKAGE = "com.winter.controller";//扫描包路径
    private final String SWAGGER2_API_TITLE = "spring-boot-demo-api";
    private final String SWAGGER2_API_DESCRIPTION = "com.winter.controller";
    private final String SWAGGER2_API_CONTACT = "WPG";
    private final String SWAGGER2_API_VERSION = "1.0";
    /**
     * createRestApi
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER2_API_BASEPACKAGE))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * apiInfo
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(SWAGGER2_API_TITLE)
                .description(SWAGGER2_API_DESCRIPTION)
                .contact(SWAGGER2_API_CONTACT)
                .version(SWAGGER2_API_VERSION)
                .build();
    }
}