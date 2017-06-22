package com.neelima.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortuneService;

@Component
public class GolfCoachImpl implements ICoach {
	public GolfCoachImpl(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	IFortuneService fortuneService;

	public String getDailyWorkout() {

		return "REHEARSE YOUR FULL SWING and DIAL IN YOUR CHIPPING DISTANCE";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
