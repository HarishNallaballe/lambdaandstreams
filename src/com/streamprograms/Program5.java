package com.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to count the number of strings in a list that start with a specific letter using streams. 

public class Program5 {
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("hari","mahesh","hari","naresh");
		String specificLetter="h";
		
		List<String> collect = list.stream().filter(s->s.startsWith(specificLetter)).collect(Collectors.toList());
	
	    System.out.println(collect);
	}
}
