package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class CountingExample {
	public static void main(String[] args) {
	
		//count the number of instructor who teaches online courses
		
		List<Instructor> instructors = Instructors.getAll();
		
		Long counting = instructors.stream().filter(Instructor::isOnlineCourses)
		                    .collect(Collectors.counting());
		System.out.println(counting);
	}
}
