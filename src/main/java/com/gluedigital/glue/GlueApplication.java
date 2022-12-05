package com.gluedigital.glue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.gluedigital")
public class GlueApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlueApplication.class, args);
	}

}
