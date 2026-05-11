package com.telusko.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetings {

	@Override
	public String generateWish(String name) {
		
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		
		if(hour < 12) {
			return "Good morning " + name;
		}
		else {
			return "Good Night " + name + " hello";
		}
		
	}

}
