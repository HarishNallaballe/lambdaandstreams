package com.streamprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to calculate the average of a list of integers using streams.
public class StreamsExample1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
	}
}
