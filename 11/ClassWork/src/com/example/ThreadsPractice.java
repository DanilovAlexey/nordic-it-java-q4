package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadsPractice {

	public static void main(String[] args) throws InterruptedException {
		var debug = true;

		var clients = Collections.synchronizedCollection(new ArrayList<Integer>());
		var clientsServed = Collections.synchronizedCollection(new ArrayList<Integer>());

		for (int i = 1; i <= 2000; i++) {
			clients.add(i);
		}

		var iterator = clients.iterator();

		var thread1 = new Thread() {

			@Override
			public void run() {
				while (iterator.hasNext()) {
					var client = iterator.next();

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						e.printStackTrace();
					}

					if (debug)
						System.out.println("thread1 client:" + client);

					clientsServed.add(client);
				}
			}
		};

		var thread2 = new Thread() {

			@Override
			public void run() {
				while (iterator.hasNext()) {
					var client = iterator.next();

					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						e.printStackTrace();
					}

					if (debug)
						System.out.println("thread2 client:" + client);

					clientsServed.add(client);
				}
			}
		};

		var thread3 = new Thread() {

			@Override
			public void run() {
				while (iterator.hasNext()) {
					var client = iterator.next();

					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						e.printStackTrace();
					}

					if (debug)
						System.out.println("thread3 client:" + client);

					clientsServed.add(client);
				}
			}
		};

		var thread4 = new Thread() {

			@Override
			public void run() {
				while (iterator.hasNext()) {
					var client = iterator.next();

					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						e.printStackTrace();
					}

					if (debug)
						System.out.println("thread4 client:" + client);

					clientsServed.add(client);
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

		System.out.println("Обработано клиентов:" + clientsServed.size());

	}

}
