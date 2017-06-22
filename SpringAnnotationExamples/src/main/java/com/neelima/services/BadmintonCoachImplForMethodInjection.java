package com.neelima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Component
public class BadmintonCoachImplForMethodInjection implements ICoach {

	IFortuneService fortuneService;

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 1hr every day and Practice badminton for 5hrs";
	}

	public String getDailyFortune() {

		return "Work really hard" + fortuneService.getFortune();
	}

	@Autowired
	public void doSomeCrazyStuff(IFortuneService thefortuneService) {
		System.out.println("Play whichever games you like..");
		System.out.println("Method injection..");

		fortuneService = thefortuneService;
	}

}
