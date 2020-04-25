package shop;

import java.util.concurrent.CopyOnWriteArrayList;

public class Cash implements Runnable {
	private CopyOnWriteArrayList<Integer> queue;
	private CopyOnWriteArrayList<Integer> result;
	private int cashNumber;

	public Cash(int cashNumber, CopyOnWriteArrayList<Integer> queue, CopyOnWriteArrayList<Integer> result) {
		super();
		this.cashNumber = cashNumber;
		this.queue = queue;
		this.result = result;
	}

	private boolean serve() {
		int client;
		synchronized (Cash.class) {
			if (queue.isEmpty()) {
				return false;
			} else {
				client = queue.remove(0);

			}
			result.add(client);
			//System.out.println("Касса " + this.cashNumber + " Клиент:" + client );
			return true;
		}
	}

	@Override
	public void run() {
		while (serve()) {
			if (Thread.interrupted()) {
				System.out.println("Shutdown");
				return;
			}
		}
	}

}
