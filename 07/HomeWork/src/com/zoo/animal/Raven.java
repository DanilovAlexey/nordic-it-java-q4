package com.zoo.animal;

public class Raven extends Animal {
	public Raven(String kind) {
		super(kind);
	}

	private Integer size;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void say() {
		System.out.println("кааааррррр");
	}

}
