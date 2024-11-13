package com.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to convert a list of strings to uppercase or lowercase using streams. 

public class Example2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hari","Harish");
		List<String> upper = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> lower = list.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(upper);
		lower.forEach(System.out::println);
	}
}
