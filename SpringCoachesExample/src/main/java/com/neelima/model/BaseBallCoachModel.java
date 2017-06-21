package com.neelima.model;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortune;

public class BaseBallCoachModel implements ICoach {

	// defining private feild for dependency
	private IFortune fortune;

	// defining constructor for dependency injection
	public BaseBallCoachModel(IFortune fortune) {
		super();
		this.fortune = fortune;
	}

	public String getDailyWorkout() {

		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {

		return fortune.getFortune();
	}

}
