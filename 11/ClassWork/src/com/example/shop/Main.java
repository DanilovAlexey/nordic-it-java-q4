package com.example.shop;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

import com.example.MoverCallable;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		var queue = new CopyOnWriteArrayList<Integer>();
		var result = new CopyOnWriteArrayList<Integer>();
		var threadPool = new ArrayList<Thread>();
		
		for (int i = 1; i <= 2000; i++) {
			queue.add(i);
		}
		
		System.out.println("Пример с классом Runnable");
		System.out.println("Очередь " + queue.size());
		for (var i = 1; i <= 4; i++) {
			threadPool.add(new Thread(new Cash(i, queue, result)));
		}
		
		for (var cash : threadPool) {
			cash.start();
		}
		
		
		for (var cash : threadPool) {
			cash.join();
		}
		
		System.out.println("Очередь " +queue.size());
		System.out.println("Обработано " +result.size());
		System.out.println("=====");
		
		
		
		System.out.println("Пример с ThreadExecutor и LinkedBlockingDeque");
		var queue2 = new LinkedBlockingDeque<Integer>();
		var result2 = new LinkedBlockingDeque<Integer>();
		
		for (int i = 1; i <= 2000; i++) {
			queue2.add(i);
		}
		
		System.out.println("Очередь " +queue2.size());
		
		
		var executorService = Executors.newFixedThreadPool(4);
		
		var arrayList = new ArrayList<Future<Integer>>();
		for (var i = 1; i <= 4; i++) {
			var task = executorService.submit(new CashCallable(i, queue2, result2));
			arrayList.add(task);
		}
		
		for (var i = 0; i < 4; i++) {
			try {
				var res = arrayList.get(i).get();
				System.out.println(res);
			} catch (ExecutionException e) {
				System.out.println(e.getMessage());
			}
		}

		/* Это для Runnable задач */
		//executorService.awaitTermination(1, TimeUnit.SECONDS);
		//executorService.shutdownNow();
		
		/* Это рекомендуется для Callable*/
		executorService.shutdown();
		
		System.out.println("Очередь " +queue2.size());
		System.out.println("Обработано " +result2.size());
	}

}
