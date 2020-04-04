package com.example;

public class ThreadApplication {

	public static void main(String[] args) throws InterruptedException {
		var thread1 = new Thread(new HelloWorldTask(1));
		var thread2 = new Thread(new HelloWorldTask(2));
		var thread3 = new Thread(new HelloWorldTask(3));
		var thread4 = new Thread(new HelloWorldTask(4));

		thread1.start();
		thread1.join(2000);
		
		thread2.start();
		thread3.start();
		
		thread2.join(2000);				
		thread3.join(2000);
		
		thread4.start();
		thread4.join(2000);
	}

}
