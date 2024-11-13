package com.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class GroupingByExample {
	public static void main(String[] args) {
	
		//group list of names by thier length
		
		Map<Integer, List<String>> length = Instructors.getAll().stream().map(Instructor::getName)
		           .collect(Collectors.groupingBy(String::length));
		System.out.println(length);
		
		//grouping instructor by thier experience
		
		Map<Integer, List<Instructor>> exp = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getYearsOfExp));
		
		exp.forEach((key,value)->{
			System.out.println("key : "+key+"  value : "+value);
		});

		
		//grouping by length of the name and also checks that the name contains e and only return those names which has e init
		
		Map<Integer, List<String>> collect = Instructors.getAll().stream()
		 					.map(Instructor::getName)
		                    .collect(Collectors.groupingBy(String::length,Collectors.filtering(s->s.startsWith("H"), Collectors.toList())));
	   System.out.println(collect);
	   
	   //instructor grouping by them senior(>10) and junior(<10) and filter them on online courses
	   Map<String, List<Instructor>> collect2 = Instructors.getAll().stream()
	      .collect(Collectors.groupingBy(s->s.getYearsOfExp()>8?"SENIOR":"jUNIOR"
	   ,Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())));
	
	   collect2.forEach((key,value)->{
		   System.out.println("key : "+key+" value : "+value);
	   });
	
	}
}
