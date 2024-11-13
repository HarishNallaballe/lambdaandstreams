package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class FilterExample {
public static void main(String[] args) {
	
	List<Instructor> instructors = Instructors.getAll();
	
	//return instructors sorted by thier name and have more than 10 yearsOfExp 
	
	List<String> names = instructors.stream().filter(s->s.getYearsOfExp()>5)
		                 .sorted(Comparator.comparing(Instructor::getName))
			             .map(Instructor::getName)
			             .collect(Collectors.toList());
	
	System.out.println(names);
	
}
}
