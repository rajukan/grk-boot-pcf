package com.org.vg.pcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class PCFApplication extends SpringBootServletInitializer
{
	 public static void main(final String[] args) {
	        SpringApplication.run(PCFApplication.class, args);
	    }

	    @Override
	    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
	        return application.sources(PCFApplication.class);
	    }
	}
