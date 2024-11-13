package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxandMinExample {
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,2,34,5,6);
		
		//max using stream max function and reduce
		
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		if(max.isPresent()) {
			System.out.println(max.get());
		}
		
		Optional<Integer> max1 = list.stream().max(Integer::max);
		if(max1.isPresent()) {
			System.out.println(max.get());
		}
		
		//max using reduce operation
		
		Optional<Integer> maxByReduce = list.stream().reduce((a,b)->a>b?a:b);
		if(maxByReduce.isPresent()) {
			System.out.println(maxByReduce.get());
		}
		
		Optional<Integer> min = list.stream().min(Integer::compareTo);
		if(min.isPresent()) {
			System.out.println(min.get());
		}
		
		Optional<Integer> min1 = list.stream().min(Integer::min);
		if(min1.isPresent()) {
			System.out.println(min.get());
		}
		
		Optional<Integer> minByReduce = list.stream().reduce((a,b)->a<b?a:b);
		if(minByReduce.isPresent()) {
			System.out.println(minByReduce.get());
		}
	}
}
