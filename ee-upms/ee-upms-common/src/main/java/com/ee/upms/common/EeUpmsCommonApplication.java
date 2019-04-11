package com.ee.upms.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ee.upms.common.dao.mapper")
public class EeUpmsCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EeUpmsCommonApplication.class, args);
	}

}
