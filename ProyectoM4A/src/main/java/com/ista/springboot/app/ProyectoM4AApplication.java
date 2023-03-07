package com.ista.springboot.app;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ista.springboot.app.models.services.I.FileService;

@SpringBootApplication
public class ProyectoM4AApplication implements CommandLineRunner{
	
	@Resource
	FileService fileService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoM4AApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
			}
		};
	}
	
	@Override
	public void run(String... arg) throws Exception{
		fileService.deleteAll();
		fileService.init();
	}

	
	

}
