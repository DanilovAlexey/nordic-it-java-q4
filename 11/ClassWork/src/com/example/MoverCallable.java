package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class MoverCallable implements Callable<Integer> {

	private ArrayBlockingQueue<Integer> queue;
	private ArrayBlockingQueue<Integer> vector;
	private Integer cnt = 0;

	private static Object lock = new Object();

	public MoverCallable(ArrayBlockingQueue<Integer> queue, ArrayBlockingQueue<Integer> vector) {
		super();
		this.queue = queue;
		this.vector = vector;
	}


	private boolean moveElement() {
		var elem = queue.poll();
		if (elem != null) {
			vector.add(elem);
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public Integer call() throws Exception {
		while (moveElement()) {
			cnt++;
		}
		return cnt;
	}

}
