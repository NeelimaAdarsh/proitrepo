package com.neelima.services;

import com.neelima.interfaces.IFortuneService;

public class SadFortuneService implements IFortuneService {

	public String getFortune() {
		return "You have to do extra work today...:(";
	}

}
