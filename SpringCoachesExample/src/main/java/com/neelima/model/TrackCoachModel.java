package com.neelima.model;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortune;

public class TrackCoachModel implements ICoach {

	private IFortune fortune;

	public String getDailyWorkout() {

		return "Run a hard 5K";
	}

	public TrackCoachModel(IFortune fortune) {
		super();
		this.fortune = fortune;
	}

	public String getDailyFortune() {

		return "Just do it:" + fortune.getFortune();
	}

	// add an init method
	public void doStartUp() {
		System.out.println("Track Coach:inside Method-doStartUp");
	}

	// add an destroy method
	public void doCleanUp() {
		System.out.println("Track Coach:inside Method-doCleanUp");
	}

}
