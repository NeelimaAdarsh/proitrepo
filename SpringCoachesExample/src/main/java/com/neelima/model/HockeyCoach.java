package com.neelima.model;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortune;

public class HockeyCoach implements ICoach {
	private String hockeyType;
	private String teamLength;
	IFortune fortune;

	public HockeyCoach() {
		super();
	}

	public String getHockeyType() {
		return hockeyType;
	}

	public void setHockeyType(String hockeyType) {
		this.hockeyType = hockeyType;
	}

	public String getTeamLength() {
		return teamLength;
	}

	public void setTeamLength(String teamLength) {
		this.teamLength = teamLength;
	}

	public IFortune getFortune() {
		return fortune;
	}

	public void setFortune(IFortune fortune) {
		this.fortune = fortune;
	}

	public String getDailyWorkout() {

		return "Daily Ice skate for 3hrs";
	}

	public String getDailyFortune() {

		return "Do your Best" + fortune.getFortune();
	}

}
