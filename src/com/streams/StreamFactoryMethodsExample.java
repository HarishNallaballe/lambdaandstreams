package com.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodsExample {
	public static void main(String[] args) {
	
		Stream<Integer> stream= Stream.of(1,2,3,4,5,6,7,8);
		stream.forEach(System.out::println);
		
		//iterate a stream of 10 even numbers
		System.out.println("------------------------");
		Stream<Integer> even = Stream.iterate(0,i->i+2).limit(10);
		even.forEach(System.out::println);
		
		System.out.println("----------------");
		//generate 5 random numbers
		
		Stream<Integer> random = Stream.generate(new Random()::nextInt).limit(4);
		random.forEach(System.out::println);
		
	}
}
