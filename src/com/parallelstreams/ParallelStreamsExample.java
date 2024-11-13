package com.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {
	public static void main(String[] args) {
	
		long seq = measure(ParallelStreamsExample::sumSeqStream);
		System.out.println("seq : "+seq);
		seq = measure(ParallelStreamsExample::sumParallelStream);
		
		
		System.out.println("Parallel : "+seq);
		
	}
	
	public static long measure(Supplier supplier) {
		long startTime=System.currentTimeMillis();
		for(int i=0;i<20;i++)
		supplier.get();
		return System.currentTimeMillis()-startTime;
	}
	
	public static int sumSeqStream() {
		return IntStream.rangeClosed(1, 10000).sum();
	}
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 10000).parallel().sum();
	}
}
