package com.neelima.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neelima.interfaces.ICoach;

public class SpringContainerClass {

	public static void main(String[] args) {
		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive beans from the container

		ICoach baseBallCoach = context.getBean("baseBallCoach", ICoach.class);
		ICoach trackCoach = context.getBean("trackCoach", ICoach.class);

		// call methods on beans
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		// close the context
		context.close();

	}

}
