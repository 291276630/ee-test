package com.ee.upms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.ee.upms.common.dao.mapper")
public class EeUpmsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EeUpmsWebApplication.class, args);
	}

}
