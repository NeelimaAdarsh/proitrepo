package com.neelima.mainclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neelima.interfaces.ICoach;

public class SpringContainerWithAnnotations {

	public static void main(String[] args) {
		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		ICoach tennisCoach = context.getBean("thatSillyCoach", ICoach.class);
		ICoach boxingCoach = context.getBean("boxingCoach", ICoach.class);
		ICoach horseCoach = context.getBean("horseRacingSetterInjection", ICoach.class);
		ICoach badmintonCoach = context.getBean("badmintonCoachImplForMethodInjection", ICoach.class);
		ICoach swimCoach = context.getBean("swimCoachImpl", ICoach.class);
		// call methods on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());

		System.out.println(boxingCoach.getDailyWorkout());
		System.out.println(boxingCoach.getDailyFortune());

		System.out.println(horseCoach.getDailyWorkout());
		System.out.println(horseCoach.getDailyFortune());

		System.out.println(badmintonCoach.getDailyWorkout());
		System.out.println(badmintonCoach.getDailyFortune());

		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		// close container
		context.close();
	}

}
