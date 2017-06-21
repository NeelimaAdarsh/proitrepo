package com.neelima.model;

import com.neelima.interfaces.ICoach;
import com.neelima.interfaces.IFortune;

public class CircketCoach implements ICoach {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Circket coach inside Settrr method - setEmailAddress");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Circket coach inside Settrr method - setTeam");

		this.team = team;
	}

	private String team;

	private IFortune fortune;

	public void setFortune(IFortune fortune) {
		System.out.println("Circket coach inside Settrr method - setFortune");
		this.fortune = fortune;
	}

	public CircketCoach() {
		System.out.println("Circket coach inside :no argument constructor");
	}

	public String getDailyWorkout() {

		return "Practice fastbowling for 15mins Every single day";
	}

	public String getDailyFortune() {

		return fortune.getFortune();
	}

}
