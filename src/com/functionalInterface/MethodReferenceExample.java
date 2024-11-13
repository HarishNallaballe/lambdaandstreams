package com.functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {
	public static void main(String[] args) {
	
		Predicate<Instructor> p=Instructor::isOnlineCourses;
		
		List<Instructor> instructors = Instructors.getAll();
		
		Consumer<Instructor> c=System.out::println;
		
		instructors.forEach(ins->{
			if(p.test(ins)) {
				c.accept(ins);
			}
		});
		
	}
}
