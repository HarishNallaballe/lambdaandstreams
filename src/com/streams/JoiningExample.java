package com.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class JoiningExample {
	public static void main(String[] args) {
	
		Stream<String> stream = Stream.of("E","F","G","H");
		
//		String s = stream.collect(Collectors.joining());
//		System.out.println(s);
		
//		String s = stream.collect(Collectors.joining(","));
//		System.out.println(s);
		
//		String s = stream.collect(Collectors.joining(",","{","}"));
//		System.out.println(s);
		
		//instructor name separated by , and prefix is '{' and suffix is '}'
		String names = Instructors.getAll().stream().map(Instructor::getName)
		           .collect(Collectors.joining(", ","{","}"));
		System.out.println(names);
	}
}
