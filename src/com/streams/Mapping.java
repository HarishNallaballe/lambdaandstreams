package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class Mapping {
	public static void main(String[] args) {
	
		List<Instructor> instructors = Instructors.getAll();
		List<String> names = instructors.stream().collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
		System.out.println(names);
	}
}
