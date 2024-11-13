package com.streams;

import java.util.List;
import java.util.Optional;

import com.functionalInterface.Instructor;
import com.functionalInterface.Instructors;

public class StreamMapFilterReduceExample {
	public static void main(String[] args) {
	
		List<Instructor> instructors = Instructors.getAll();
		
		//total years of exp b/n instructors
		
		Optional<Integer> totalYearOfExp = instructors.stream()
				             .filter(Instructor::isOnlineCourses)
				             .map(Instructor::getYearsOfExp)
		                    .reduce(Integer::sum);
		
		if(totalYearOfExp.isPresent()) {
		System.out.println(totalYearOfExp.get());
		}		
	}
}
