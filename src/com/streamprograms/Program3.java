package com.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Write a Java program to calculate the sum of all even, odd numbers in a list using streams. 

public class Program3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> sum = list.stream().filter(i->i%2==0).reduce(Integer::sum);
		if(sum.isPresent()) {
			System.out.println(sum.get());
		}
		
		int sumOdd = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(sumOdd);
		
	}
}
