package com.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Write a Java program to remove all duplicate elements from a list using streams.

public class Program4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hari","mahesh","hari","naresh");
		Set<String> names = list.stream().collect(Collectors.toSet());
		System.out.println(names);
	}

}
