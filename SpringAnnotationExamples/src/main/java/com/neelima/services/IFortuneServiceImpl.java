package com.neelima.services;

import org.springframework.stereotype.Component;

import com.neelima.interfaces.IFortuneService;

@Component
public class IFortuneServiceImpl implements IFortuneService {

	public String getFortune() {

		return "Today is your Lucky Day...!";
	}

}
