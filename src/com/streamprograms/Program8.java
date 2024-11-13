package com.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//  Write a Java program to find the maximum and minimum values in a list of integers using streams.

public class Program8 {
	public static void main(String[] args) {
	
		IntStream numbers = IntStream.range(1, 11);
		
//		int min = numbers.min().orElse(0);
//		System.out.println(min);
		
//		int max = numbers.max().orElse(0);
//		System.out.println(max);
		
		List< Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		int max = nums.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println(max);
		
		Integer min = nums.stream().min(Integer::compareTo).orElse(0);
		System.out.println(min);
	}
}
