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

		for (var item : queue1) {
			var thread = new Thread() {

				@Override
				public void run() {
					clients.add(item);
				}

			};
			thread.start();
		}

		for (var item : queue2) {
			var thread = new Thread() {

				@Override
				public void run() {
					clients.add(item);
				}

			};
			thread.start();
		}

		for (var item : queue3) {
			var thread = new Thread() {

				@Override
				public void run() {
					clients.add(item);
				}

			};
			thread.start();
		}

		for (var item : queue4) {
			var thread = new Thread() {

				@Override
				public void run() {
					clients.add(item);
				}

			};
			thread.start();
		}

		for (int i = 1; i <= 2000; i++) {
			if (!clients.contains(i))
				System.out.println(i);
		}

		System.out.println("=====");
		System.out.println(clients.size());

	}

}
