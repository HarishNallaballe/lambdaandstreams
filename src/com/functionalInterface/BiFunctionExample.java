package com.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
	public static void main(String[] args) {
	
		List<Instructor> instructors = Instructors.getAll();
		
		Predicate<Instructor> p=i->i.isOnlineCourses();
		
		Map<String,Integer> map=new HashMap<>();
		
		BiFunction<List<Instructor>,Predicate<Instructor>,Map<String,Integer>> bi= (ins,pre)->{
			ins.forEach(instructor->{
				if(pre.test(instructor)) {
					map.put(instructor.getName(), instructor.getYearsOfExp());
				}
			});
			return map;
		};
		System.out.println(bi.apply(instructors, p));
		
	}
}
