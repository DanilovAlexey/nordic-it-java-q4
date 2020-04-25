package shop;

import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class CashCallable implements Callable<Integer> {
	private LinkedBlockingDeque<Integer> queue;
	private LinkedBlockingDeque<Integer> result;
	private int cashNumber;
	private int clientsCnt = 0;

	public CashCallable(int cashNumber, LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> result) {
		super();
		this.cashNumber = cashNumber;
		this.queue = queue;
		this.result = result;
	}

	private boolean serve() {
		int client;
		synchronized (CashCallable.class) {
			if (queue.isEmpty()) {
				return false;
			} else {
				client = queue.poll();

			}
			/*
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			result.add(client);
			this.clientsCnt++;
			return true;
		}
	}

	@Override
	public Integer call() throws Exception {
		while (serve()) {
			if (Thread.interrupted()) {
				System.out.println("Shutdown");
				return clientsCnt;
			}
		}
		return this.clientsCnt;
	}

}
