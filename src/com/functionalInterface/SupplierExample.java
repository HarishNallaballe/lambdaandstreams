package com.functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
	
		Supplier<Integer> sup=()->(int)(Math.random()*1000);
		System.out.println(sup.get());
		
	}
}
