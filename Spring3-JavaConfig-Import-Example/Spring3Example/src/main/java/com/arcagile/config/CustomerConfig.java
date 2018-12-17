package com.arcagile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arcagile.core.CustomerBo;

@Configuration
public class CustomerConfig {
	
	@Bean(name="customer")
	public CustomerBo customerBo(){
		
		return new CustomerBo();
		
	}
}