package com.telusko.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Student;

@RestController
@RequestMapping("apil2")
public class StudentController {
	
	
	@GetMapping("/info")
	public ResponseEntity<Student> studentInfo(){
		Student std = new Student(1, "Yatharth", "blr");
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public String addstudent(@RequestBody Student data){
		System.out.println(data);
		return "data saved";
	}
}
