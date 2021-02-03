package com.yp.springboot.ssm.configuration;

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
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo("绘本馆-绘本模块",
                        "绘本馆的绘本接口模块测试",
                        "http://localhost:8099/swagger-ui.html",
                        "v2.0"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yp.springboot.ssm.controller"))
                .paths(PathSelectors.any())
                .build();

    }


    protected ApiInfo apiInfo(String title, String desc, String url, String version){
        return new ApiInfoBuilder()
                .title("绘本馆-绘本模块")
                .description("绘本馆的绘本接口模块测试")
                .termsOfServiceUrl("http://localhost:8099/swagger-ui.html")
                .version("v2.0")
                .build();
    }
}
