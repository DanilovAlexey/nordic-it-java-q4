package com.example;

public class Box<E> {
	
	private E data;

	public Box() {
		super();
	}

	public Box(E data) {
		super();
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}	
}