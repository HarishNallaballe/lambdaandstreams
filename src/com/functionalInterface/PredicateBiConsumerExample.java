package com.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateBiConsumerExample {
	public static void main(String[] args) {
	
		
		List<Instructor> instructors = Instructors.getAll();
		
		// print instructor who teaches online
		Predicate<Instructor> p1=i->i.isOnlineCourses();
		
		//instructor experience > 10
		Predicate<Instructor> p2=i->i.getYearsOfExp()>4;
		
		BiConsumer<String, List<String>> b1=(name,courses)->System.out.println(name+" "+courses);
		
		// Print name and courses
		instructors.forEach(instructor->{
			if(p1.and(p2).test(instructor)) {
				b1.accept(instructor.getName(), instructor.getCourses());
			}
		});
		
	}
}
