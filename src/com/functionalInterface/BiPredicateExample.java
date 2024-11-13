package com.functionalInterface;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		
		List<Instructor> instructors = Instructors.getAll();
	
		BiPredicate<Boolean,Integer> bp = (online,exp)->online==true && exp>1;
		
		instructors.forEach(instructor->{
			if(bp.test(instructor.isOnlineCourses(), instructor.getYearsOfExp())) {
				System.out.println(instructor);
			}
		});
	}
}
