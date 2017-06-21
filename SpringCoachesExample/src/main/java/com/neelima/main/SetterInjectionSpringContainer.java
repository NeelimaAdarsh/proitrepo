package com.neelima.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.neelima.model.CircketCoach;
import com.neelima.model.HockeyCoach;

public class SetterInjectionSpringContainer {

	public static void main(String[] args) {
		// Load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive beans from the container

		CircketCoach circket = context.getBean("circketCoach", CircketCoach.class);
		HockeyCoach hockey = context.getBean("hockeyCoach", HockeyCoach.class);
		// call methods on beans

		System.out.println(circket.getDailyWorkout());
		System.out.println(circket.getDailyFortune());
		System.out.println(circket.getEmailAddress());
		System.out.println(circket.getTeam());

		System.out.println(hockey.getDailyWorkout());
		System.out.println(hockey.getDailyFortune());
		System.out.println(hockey.getHockeyType());
		System.out.println(hockey.getTeamLength());
		// close the context
		context.close();
	}

}
