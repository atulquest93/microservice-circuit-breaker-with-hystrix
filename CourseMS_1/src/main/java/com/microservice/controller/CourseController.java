package com.microservice.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.dto.Course;

@RestController
public class CourseController {

	@RequestMapping("/getCourses")
	public ArrayList<Course> greeting() {
	    	
	        Course java = new Course("1001", "Java", "Videos","Course Microservice");
	        Course javascript = new Course("1002", "Javascript","Course", "Course Microservice");
	        Course spring = new Course("1003", "Spring Boot", "Course", "Course Microservice");
	        
	        ArrayList<Course> list = new ArrayList<Course>();
	        list.add(javascript);
	        list.add(java);
	        list.add(spring);
	        
	        return list;
	        
	 }
	
	@RequestMapping("/info")
	public String getInfo() {
		return "Volla ! This is course microservice-1 saying hello ! <br> <a href='./getCourses'>Check Endpoint response</a>";
	}
}