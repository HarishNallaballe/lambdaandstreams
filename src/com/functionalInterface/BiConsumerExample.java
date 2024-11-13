package com.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		
		
		BiConsumer<Integer,Integer> bi=(x,y)-> System.out.println(x+y);
		bi.accept(10,20);
		
		List<Instructor> instructors = Instructors.getAll();
		
		//print out name and gender of instructor
		
		BiConsumer<String,String> b=(name,gender)->System.out.println(name+" "+gender);
		instructors.forEach(instructor->{
			b.accept(instructor.getName(), instructor.getGender());
		});
		
		BiConsumer<String,List<String>> b1=(name,courses)->System.out.println(name+ " "+ courses);	
		instructors.forEach(instructor->{
			b1.accept(instructor.getName(), instructor.getCourses());
		});
	}

}
