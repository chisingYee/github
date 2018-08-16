package com.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.yc.dao"})
public class springbootApplication {

	public static void main(String[] args){
		SpringApplication.run(springbootApplication.class, args);
	}
}
