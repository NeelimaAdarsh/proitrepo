package com.neelima.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Configuration
@ComponentScan("com.neelima.*")
public class SportConfig {

	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();

	}

	@Bean
	public ICoach golfCoachImpl() {
		GolfCoachImpl golfCoach = new GolfCoachImpl(sadFortuneService());
		return golfCoach;

	}

}
