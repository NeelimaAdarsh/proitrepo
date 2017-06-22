package com.neelima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Component("thatSillyCoach")
public class TennisCoachImpl implements ICoach {

	private IFortuneService fortuneService;

	@Autowired
	public TennisCoachImpl(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
