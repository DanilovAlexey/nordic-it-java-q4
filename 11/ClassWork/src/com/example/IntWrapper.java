package com.example;

public class IntWrapper {
	private volatile int count;
	
	public synchronized void increment() {
		count += 1;
	}
	
	public synchronized int getCount() {
		return count;
	}
}
