package com.example;

import java.util.*;

public class AuchanPractice {

	public static void main(String[] args) {

		var clients = Collections.synchronizedList(new ArrayList<Integer>());
		

		var queue1 = new ArrayList<Integer>();
		var queue2 = new ArrayList<Integer>();
		var queue3 = new ArrayList<Integer>();
		var queue4 = new ArrayList<Integer>();

		for (int i = 1; i <= 2000; i++) {
			if (i > 0 && i <= 500)
				queue1.add(i);

			if (i > 500 && i <= 1000)
				queue2.add(i);

			if (i > 1000 && i <= 1500)
				queue3.add(i);

			if (i > 1500 && i <= 2000)
				queue4.add(i);
		}

		
		for (int i = 0; i < 500; i++) {
			var k = i;
			
			var thread1 = new Thread() {

				@Override
				public void run() {
					clients.add(queue1.get(k));
				}

			};
			
			var thread2 = new Thread() {

				@Override
				public void run() {
					clients.add(queue2.get(k));
				}

			};
			
			
			var thread3 = new Thread() {

				@Override
				public void run() {
					clients.add(queue3.get(k));
				}

			};
			
			
			var thread4 = new Thread() {

				@Override
				public void run() {
					clients.add(queue4.get(k));
				}

			};
			
			
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
		}
		
	
		
		System.out.println(clients.size());
		System.out.println("=====");
		
		for (int i = 1; i <= 2000; i++) {
			if (!clients.contains(i))
				System.out.println(i);
		}
	}

}
