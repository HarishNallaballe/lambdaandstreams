package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitandSkipExample {
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,2,34,5,6,7,8,9,9,10);
		
		List<Integer> limit = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limit);
		
		System.out.println("----------------");
		
		List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skip);
	}
}
