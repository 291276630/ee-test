package com.ee.upms.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ee.upms.common.dao")
public class EeUpmsAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EeUpmsAdminApplication.class, args);
	}

}
