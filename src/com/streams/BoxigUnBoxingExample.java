package com.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxigUnBoxingExample {
	public static void main(String[] args) {
	
		IntStream numbers = IntStream.rangeClosed(1, 10);
		
		List<Integer> boxing = numbers.boxed().collect(Collectors.toList());
		
		boxing.forEach(System.out::println);
		
		//unboxing we can done by 2 ways 
		// 1) bu using reduce()   2) mapToInt()
		
		Optional<Integer> unboxing1 = boxing.stream().reduce((a,b)->a+b);
		if(unboxing1.isPresent()) {
			System.out.println(unboxing1.get());
		}
		
		int sum = boxing.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
