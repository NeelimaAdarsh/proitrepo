package com.neelima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Component
public class HorseRacingSetterInjection implements ICoach {

	IFortuneService fortuneService;

	public String getDailyWorkout() {

		return "Ride horse daily for 3hrs";
	}

	public String getDailyFortune() {

		return "Try hard" + fortuneService.getFortune();
	}

	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("Setter Injection");
		this.fortuneService = fortuneService;
	}

}
