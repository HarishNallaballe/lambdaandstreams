package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class ReduceExample {
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,3,4,5,6,7,5);
		
		Integer reduce = list.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
		Optional<Integer> reduce2 = list.stream().reduce((a,b)->a*b);
		System.out.println(reduce2.get());
		
		//print the instrctor who has the highest year of exp
		
		List<Instructor> instructors = Instructors.getAll();
		Optional<Instructor> instructor = instructors.stream().reduce((a,b)->a.getYearsOfExp()>b.getYearsOfExp()?a:b);
		
		if(instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		
	
		
	}
}
