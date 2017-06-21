package com.neelima.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neelima.interfaces.ICoach;

public class BeanScopeSpringContainer {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrive beans from spring container
		ICoach baseballCoach = context.getBean("baseBallCoach", ICoach.class);
		ICoach baseCoach = context.getBean("baseBallCoach", ICoach.class);

		ICoach trackCoach1 = context.getBean("trackCoach", ICoach.class);
		ICoach trackCoach2 = context.getBean("trackCoach", ICoach.class);

		boolean baseBallResult = (baseballCoach == baseCoach);

		if (baseBallResult == true) {
			System.out.println("Its a singleton :" + baseBallResult + ".They are pointing to the same object");
			System.out.println("Memory location for baseballcoach: " + baseballCoach);
			System.out.println("Memory location for basecoach: " + baseCoach);

		} else {
			System.out.println("Its a Prototype : " + baseBallResult);
		}
		boolean trackCoachResult = (trackCoach1 == trackCoach2);
		System.out.println("point to same object : " + trackCoachResult + "because we defined as prototype in xml: ");
		System.out.println("Memory location for TrackCoach1: " + trackCoach1);
		System.out.println("Memory location for TrackCoach1: " + trackCoach2);

		context.close();
	}

}
