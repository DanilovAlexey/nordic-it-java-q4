package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadApplication2 {

	public static void main(String[] args) throws InterruptedException {
		//var count = new IntWrapper();
		var count = Collections.synchronizedList(new ArrayList<Integer>()); //new IntWrapper(); //new AtomicInteger();
		
		var pool = new ArrayList<Thread>();

		for (int i = 0; i < 1000; i++) {
			var k = i;
			var thread = new Thread() {

				@Override
				public void run() {
					count.add(k);
					//count.increment();
					//count.getAndIncrement();
				}
				
			};
			thread.start();
			pool.add(thread);
			
		}
		
		for (var thread : pool) {
			//thread.start();
			thread.join();
		}
		
		for (int i = 0; i < 1000; i++) {
			if (!count.contains(i))
				System.out.println(i);
		}
		
		System.out.println("=============");
		//System.out.println(count.get());
		//System.out.println(count.getCount());
		System.out.println(count.size());

	}

}
