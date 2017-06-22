package com.neelima.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.neelima.interfaces.ICoach;
import com.neelima.services.SportConfig;

public class JavaConficContainerWithBeans {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		ICoach golfCoach = context.getBean("golfCoachImpl", ICoach.class);

		System.out.println(golfCoach.getDailyWorkout());
		System.out.println(golfCoach.getDailyFortune());

	}

}
