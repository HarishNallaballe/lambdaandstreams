package com.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateFunctions {
	public static void main(String[] args) {
	
		IntStream stream = IntStream.range(1, 11);
		
		int sum = IntStream.range(1, 11).sum();
		
		OptionalInt max = IntStream.range(1, 11).max();
		
		OptionalInt min = IntStream.range(1, 11).min();
				
		OptionalDouble average = IntStream.range(1, 11).asDoubleStream().average();
		
		System.out.println(stream);
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(average);
	}
}
