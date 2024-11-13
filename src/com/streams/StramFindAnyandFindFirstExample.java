package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StramFindAnyandFindFirstExample {
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,2,34,5,6);
		
		Optional<Integer> findFirst = list.stream().findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		
		Optional<Integer> findAny = list.stream().findAny();
		if(findAny.isPresent()) {
			System.out.println(findAny.get());
		}
	}
}
