package com.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	
	public static void main(String[] args) {
		
		Consumer<String> str=s-> System.out.println(s.length());
		str.accept("harish");
		
		//eg : 2 
		
		List<Instructor> instructors= Instructors.getAll();
		Consumer<Instructor> instructor= i->System.out.println(i); 
		instructors.forEach(instructor);
		
		//loop through all the instuctor and print out thier name
		
		Consumer<Instructor> c1=s-> System.out.println( s.getName());
		instructors.forEach(c1);
		
		//loop through all the instuctors and print out thier name and courses
		Consumer<Instructor> c2=s-> System.out.println( s.getCourses());
		instructors.forEach(c1.andThen(c2));
		
		//loop through all the instructors and print out thier name depending on yearsofExp > 10
		
		System.out.println("------------------------");
		instructors.forEach(s->{
			if(s.getYearsOfExp()>1) {
				instructor.accept(s);
			}
		});
		
		//Loop through all the instructors and print out thier name and year of exp if year of exp > 5 and teaches online
		System.out.println("++++++++++++++++++++++++++");
		Consumer<Instructor> name=s->System.out.println(s.getName());
		instructors.forEach(s1->{
			if(s1.getYearsOfExp()>5 && s1.isOnlineCourses()) {
				name.accept(s1);
			}
		});
		
	}

}
