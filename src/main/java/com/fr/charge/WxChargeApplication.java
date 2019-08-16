package com.fr.charge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EnableAutoConfiguration()
@MapperScan("com.fr.charge.dao")
public class WxChargeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxChargeApplication.class, args);
	}

}
