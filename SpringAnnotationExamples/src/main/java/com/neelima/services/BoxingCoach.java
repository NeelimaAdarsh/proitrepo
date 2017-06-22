package com.neelima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Component
public class BoxingCoach implements ICoach {

	IFortuneService fortuneService;

	public String getDailyWorkout() {

		return "practice hitting the heavy bag, the speed bag, and the double end bag each 1hr daily ";
	}

	public String getDailyFortune() {

		return "Try in your own way.." + fortuneService.getFortune();
	}

	@Autowired
	public BoxingCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

}
