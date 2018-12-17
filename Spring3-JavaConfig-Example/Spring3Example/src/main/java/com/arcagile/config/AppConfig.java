package com.arcagile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.arcagile.hello.HelloWorld;
import com.arcagile.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
	
}