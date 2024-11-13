package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class MapExample {
	public static void main(String[] args) {
	
		//return instructor names from instructors list
		List<Instructor> instructors = Instructors.getAll();
		List<String> names = instructors.stream().map(Instructor::getName).collect(Collectors.toList());
		System.out.println(names);
	}
}
