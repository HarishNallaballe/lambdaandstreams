package com.streams;

import java.util.stream.Collectors;
import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class CollectorsSummingAveragingInt {
	public static void main(String[] args) {
	
		Integer collect = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExp));
		System.out.println(collect);
		
		Double average = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExp));
	    System.out.println(average);
	}
}
