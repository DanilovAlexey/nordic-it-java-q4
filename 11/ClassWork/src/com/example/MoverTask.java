package com.example;

import java.util.concurrent.CopyOnWriteArrayList;

public class MoverTask implements Runnable {

	private CopyOnWriteArrayList<Integer> queue;
	private CopyOnWriteArrayList<Integer> vector;

	private static Object lock = new Object();

	public MoverTask(CopyOnWriteArrayList<Integer> queue, CopyOnWriteArrayList<Integer> vector) {
		super();
		this.queue = queue;
		this.vector = vector;
	}

	@Override
	public void run() {
		while (moveElement()) {
			if (Thread.interrupted()) {
				System.out.println("Shutdown");
				return;
			}
		}
	}

	private boolean moveElement() {
		Integer elem;
		synchronized (MoverTask.class/*lock*/) {
			if (queue.isEmpty()) {
				return false;
			} else {
				elem = queue.remove(0);
			}
			vector.add(elem);
			return true;
		}
	}

}
