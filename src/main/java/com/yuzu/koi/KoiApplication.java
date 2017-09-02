package com.yuzu.koi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class KoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoiApplication.class, args);
	}
}
