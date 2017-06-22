package com.neelima.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.neelima.interfaces.ICoach;

@Component
public class SpringContainerWithAnnotations {

	public static void main(String[] args) {
		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		ICoach swimCoach = context.getBean("swimCoachImpl", ICoach.class);
		// call methods on the bean

		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		// close container
		context.close();
	}

}
