package com.neelima.services;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.neelima.interfaces.IFortuneService;

@Component
public class RandomFortuneService implements IFortuneService {
	private String[] data = { "You are a prisoner of your own mind .", "The greatest danger could be your stupidity",
			"A journey of a thousand miles begins with a single step.", "When one door closes,other opens",
			"Doing the best at this moment puts you in the best place for the next moment.",
			"The fortune you seek is in another cookie .", "The journey is the reward"

	};

	private Random randomNum = new Random();

	public String getFortune() {
		int index = randomNum.nextInt(data.length);
		String randomMsg = data[index];
		return randomMsg;
	}

}
