package com.yc.swagger;

import org.hamcrest.Description;
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
public class SwaggerConfig {
	//创建多个函数并用@bean注解，这样就可以针对不同的controller创建出各自的api文档，
	//这里如果函数上不配置@bean,那么Swagger只是启动了，没有创建Api信息
	
	/*
	 * 创建api文档，apiInfo()用来创建该api的基本信息
	 * 
	 * */
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
		
			.apiInfo(apiInfo())
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.yc.web.controller"))
			.paths(PathSelectors.any())
			.build();
			
	}
	
	/*
	 * 创建api信息
	 * */
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
			.title("项目信息相关内容")
			.description("以下接口是操作用户的相关信息")
			.version("1.0")
			.build();
	}
}
