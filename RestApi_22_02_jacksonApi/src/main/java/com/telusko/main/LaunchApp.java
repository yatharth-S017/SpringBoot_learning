package com.telusko.main;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Alien;

public class LaunchApp {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		Alien alien1 = new Alien(1,"yatharth", "blr");
		Alien alien2 = new Alien(1,"yatharth", "blr");
		Alien alien3 = new Alien(1,"yatharth", "blr");
		
		List<Alien> alien = Arrays.asList(alien1, alien2, alien3);
		
		
		//create ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
//		String json = mapper.writeValueAsString(alien);  //for single object
		
		String json =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(alien);
		System.out.println(json);
		
	}
}
