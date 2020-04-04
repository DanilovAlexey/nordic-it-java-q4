package com.example.detail;

import java.util.ArrayList;

public class DetailExample {

	public static void main(String[] args) throws InterruptedException {

		var arr = new ArrayList<Detail>();

		for (int i = 0; i < 20; i++) {
			arr.add(new Detail(i));
		}

		for (var item : arr) {
			var thread1 = new Thread() {

				@Override
				public void run() {
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №1. Начало.");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №1. Конец.");

				}

			};

			var thread2 = new Thread() {

				@Override
				public void run() {
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №2. Начало.");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №2. Конец.");

				}

			};

			var thread3 = new Thread() {

				@Override
				public void run() {
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №3. Начало.");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №3. Конец.");

				}

			};

			var thread4 = new Thread() {

				@Override
				public void run() {
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №4. Начало.");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №4. Конец.");

				}

			};

			var thread5 = new Thread() {

				@Override
				public void run() {
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №5. Начало.");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №5. Конец.");

				}

			};

			var thread6 = new Thread() {

				@Override
				public void run() {
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №6. Начало.");

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					System.out.println("Изделие №" + item.getDetailNumber() + ". Стадия №6. Конец.");

				}

			};

			thread1.start();
			thread2.start();

			thread1.join();
			thread2.join();

			thread3.start();
			thread3.join();

			thread4.start();
			thread5.start();

			thread4.join();
			thread5.join();

			thread6.start();

		}
	}

}
