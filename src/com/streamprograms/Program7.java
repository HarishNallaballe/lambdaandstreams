package com.streamprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
public class Program7 {
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Hari","mahesh","hari","naresh");
		
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
		
		
	}
}
