package com.neelima.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neelima.interfaces.ICoach;

public class AnnotationBeanScopeSpringContainer {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICoach golfCoach = context.getBean("golfCoachImpl", ICoach.class);

		System.out.println(golfCoach.getDailyWorkout());
		System.out.println(golfCoach.getDailyFortune());

		ICoach coach = context.getBean("swimCoachImpl", ICoach.class);
		ICoach swimCoach = context.getBean("swimCoachImpl", ICoach.class);

		boolean result = (swimCoach == coach);

		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println("Pointing to the same object : " + result);
		System.out.println("Memory location of swimCoach : " + swimCoach);
		System.out.println("Memory location of swimCoach : " + coach);

	}

}
