package com.streamprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Write a Java program to find the second smallest and largest elements in a list of integers using streams.

public class Program9 {
	public static void main(String[] args) {
	
		List< Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		
		Integer secondSmallest = nums.stream()
			      .distinct()
			      .sorted()
			      .skip(1)
			      .findFirst()
			      .orElse(null);
		
		System.out.println(secondSmallest);
		
		Integer secondlargest = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);		
	   System.out.println(secondlargest);
	
	}
}
