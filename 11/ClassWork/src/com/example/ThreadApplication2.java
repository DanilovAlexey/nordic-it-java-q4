package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadApplication2 {

	public static void main(String[] args) {
		//var count = new IntWrapper();
		var count = new AtomicInteger();

		for (int i = 0; i < 200; i++) {
			var thread = new Thread() {

				@Override
				public void run() {
					count.getAndIncrement();
				}
				
			};
			thread.start();
		}
		
		System.out.println(count.get());

	}

}
