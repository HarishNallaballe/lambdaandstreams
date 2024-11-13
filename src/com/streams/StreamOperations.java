package com.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class StreamOperations {
	public static void main(String[] args) {
	
List<Instructor> instructors = Instructors.getAll();
		
        //count  distinct
		Long courses = instructors.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.count();
		 System.out.println(courses);
		 
		 //anymatch allmatch 
		 boolean anyMatch = instructors.stream()
					.map(Instructor::getCourses)
					.flatMap(List::stream)
					.distinct()
					.noneMatch(s->s.startsWith("J"));
					//.anyMatch(s->s.startsWith("j"));
					//.allMatch(s->s.startsWith("j"));
					
		 
		System.out.println(anyMatch);
	}
}
