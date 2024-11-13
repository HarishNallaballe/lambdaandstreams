package com.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
	
		Function<Integer,Double> f=i->Math.sqrt(i);
		System.out.println( f.apply(4));
		
		Function<String,String> f1=s->s.toLowerCase();
		Function<String, String> f2=s->s.concat("In Java");
		System.out.println(f1.andThen(f2).apply("Programming "));
		System.out.println(f1.compose(f2).apply("Programming "));
		
		List<Instructor> instructors = Instructors.getAll();
		
		//map of instructor with name and years of experience
		
		Map<String, Integer> map = new HashMap<>();
		Function<List<Instructor>, Map<String,Integer>> f3=s->{
			
			s.forEach(instructor->{
				map.put(instructor.getName(), instructor.getYearsOfExp());
			});
			return map;
		};
		
	   System.out.println(f3.apply(instructors));
		
	}
}
