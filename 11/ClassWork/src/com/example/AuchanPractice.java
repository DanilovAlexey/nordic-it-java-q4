package com.example;

import java.util.*;

public class AuchanPractice {

	public static void main(String[] args) throws InterruptedException {

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


		
		var thread1 = new Thread() {

			@Override
			public void run() {
				for (var item : queue1) {
					clients.add(item);
				}
			}

		};
		
		var thread2 = new Thread() {

			@Override
			public void run() {
				for (var item : queue2) {
					clients.add(item);
				}
			}

		};
		
		
		var thread3 = new Thread() {

			@Override
			public void run() {
				for (var item : queue3) {
					clients.add(item);
				}
			}

		};
		
		
		var thread4 = new Thread() {

			@Override
			public void run() {
				for (var item : queue4) {
					clients.add(item);
				}
			}

		};
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		

		
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		
		
		for (int i = 1; i <= 2000; i++) {
			if (!clients.contains(i))
				System.out.println(i);
		}
		
		System.out.println("=====");
		System.out.println(clients.size());

	}

}
