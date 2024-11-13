package com.streams;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class StreamsExample {
	public static void main(String[] args) {
	
		//create a map of name and courses of instructor who teaches online and have years of exp >10
		List<Instructor> instructors = Instructors.getAll();
		
		Predicate<Instructor> p1=Instructor::isOnlineCourses;
		
		Predicate<Instructor> p2=i->i.getYearsOfExp()>1;
		
		Map<String, List<String>> map = instructors.stream().filter(p1).filter(p2).collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(map);
	}
}
