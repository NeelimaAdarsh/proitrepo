package com.neelima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neelima.interfaces.ICoach;

@Component
public class SwimCoachImpl implements ICoach {
	@Autowired
	IFortuneServiceImpl fortuneService;

	public String getDailyWorkout() {

		return "First do warm up free style or backStroke then pull buoy AND centre snorkel,and Finally Swim Down.";
	}

	public SwimCoachImpl() {

		super();
		System.out.println("This is feild Injection");
	}

	public String getDailyFortune() {

		return "you will conquer all obstacles,because " + fortuneService.getFortune();
	}

}
