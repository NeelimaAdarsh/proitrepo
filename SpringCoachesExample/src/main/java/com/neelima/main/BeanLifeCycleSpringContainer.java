package com.neelima.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neelima.interfaces.ICoach;

public class BeanLifeCycleSpringContainer {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// retrive beans from spring container
		ICoach trackCoach = context.getBean("trackCoach", ICoach.class);

		System.out.println(trackCoach.getDailyWorkout());

		context.close();
	}

}
