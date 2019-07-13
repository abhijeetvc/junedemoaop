package com.juneaop.junedemoaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class JunedemoaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunedemoaopApplication.class, args);
	}

}
