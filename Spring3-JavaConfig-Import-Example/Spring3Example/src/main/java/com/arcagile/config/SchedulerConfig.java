package com.arcagile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.arcagile.core.SchedulerBo;

@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBo suchedulerBo(){
		
		return new SchedulerBo();
		
	}
	
}