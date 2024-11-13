package com.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
	Predicate<Integer> p=(i)->i>10;
	System.out.println(p.test(11));
	
	Predicate<Integer> p1=(i)->i%2==0;
	System.out.println(p.and(p1).test(12));
	
	System.out.println(p.or(p1).test(1));
	
	//all instuctor who teaches online
	System.out.println("-------------------");
	List<Instructor> instructors = Instructors.getAll();
	
	   Predicate<Instructor> p2=i->i.isOnlineCourses();
	   
	   instructors.forEach(instructor->{
		 System.out.println( p2.test(instructor));
	   });
	   
	   //instructor exp > 10
	   System.out.println("-------------------");
	   Predicate<Instructor> p3=i->i.getYearsOfExp()>2;
	   instructors.forEach(ins->{
		   System.out.println(p3.test(ins));
	   });
	   
	   //print the instructor who teaches online and have exp >10
	   
	   instructors.forEach(instructor->{
		   if(p2.and(p3).test(instructor)) {
			  System.out.println(instructor); 
		   }
	   });
	
	}
}
