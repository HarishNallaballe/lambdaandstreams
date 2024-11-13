package com.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class CollectorsMinMaxExample {
	public static void main(String[] args) {
	
		Optional<Instructor> collect = Instructors.getAll().stream().collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExp)));
	
	    System.out.println(collect.get());
	    
	    Optional<Instructor> collect2 = Instructors.getAll().stream().collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExp)));
	    System.out.println(collect2.get());
	}
}
