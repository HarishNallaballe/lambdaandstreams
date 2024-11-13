package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class StreamComparator {
	public static void main(String[] args) {
		
		List<Instructor> instructors = Instructors.getAll();
		
		List<String> names = instructors.stream().sorted(Comparator.comparing(Instructor::getName))
		                    .map(Instructor::getName)
		                    .collect(Collectors.toList());
	      names.forEach(System.out::println);
	
	}
}
