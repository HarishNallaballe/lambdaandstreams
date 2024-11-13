package com.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class FlatMapExample {
	public static void main(String[] args) {
	
		//get a list of cousers which instructors offers
		
		List<Instructor> instructors = Instructors.getAll();
		
		Set<String> courses = instructors.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.toSet());
		System.out.println(courses);
		
	}
}
