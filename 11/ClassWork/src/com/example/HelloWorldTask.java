package com.example;

public class HelloWorldTask implements Runnable {

	private int number;
	
	public HelloWorldTask(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		System.out.println("Hello world! Thread="+number);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			//e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		System.out.println("I woke up Thread="+number);
	}

}
