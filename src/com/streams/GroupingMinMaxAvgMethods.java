package com.streams;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class GroupingMinMaxAvgMethods {
	public static void main(String[] args) {
	
		// grouping the instructors in two sets of online courses vs not online and get the max year of exp of instructors
		
		Map<Boolean, Object> collect = Instructors.getAll().stream()
		                    .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
		                    		Collectors.collectingAndThen(
		                    		Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExp)),
		                    		Optional::get)));
		
		collect.forEach((key,value)->{
			System.out.println(key +" "+value);
		});
		
		// average years of experience of instructors who teaches online or not
		
		 Map<Boolean, Double> collect2 = Instructors.getAll().stream()
         .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
        		 Collectors.averagingInt(Instructor::getYearsOfExp)));
		 
		 collect2.forEach((key,value)->{
			 System.out.println(key +" "+value);
		 });
	}
}
