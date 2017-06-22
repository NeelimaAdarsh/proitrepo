package com.neelima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Component
public class SwimCoachImpl implements ICoach {
	@Autowired
	@Qualifier("randomFortuneService")
	IFortuneService fortuneService;

	public String getDailyWorkout() {

		return "First do warm up free style or backStroke then pull buoy AND centre snorkel,and Finally Swim Down.";
	}

	public SwimCoachImpl() {

		super();
		System.out.println("This is feild Injection");
	}

	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
