package com.neelima.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.neelima.interfaces.ICoach;
import com.neelima.services.SportConfig;

public class JavaConficContainer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		ICoach swimCoach = context.getBean("swimCoachImpl", ICoach.class);

		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

	}

}
