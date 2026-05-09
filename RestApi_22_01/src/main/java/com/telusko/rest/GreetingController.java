package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telusko.service.IGreetings;

@Controller
@RequestMapping("apil")
public class GreetingController {
	
	@Autowired
	private IGreetings greeting;

	
	@GetMapping("/greet")
	@ResponseBody
	public ResponseEntity<String> getWishes(){
		String res = greeting.generateWish("Yatharth");
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
}
