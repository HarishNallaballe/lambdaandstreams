package com.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class PartitioningByExample {
	public static void main(String[] args) {
		
		Predicate<Instructor> p=i->i.getYearsOfExp()>10;
	
		Map<Boolean, List<Instructor>> collect = Instructors.getAll().stream().collect(Collectors.partitioningBy(p));
		                    
		collect.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
	}
}
