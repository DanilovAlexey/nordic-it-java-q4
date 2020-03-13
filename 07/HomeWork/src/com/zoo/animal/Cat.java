package com.zoo.animal;

public class Cat extends Animal {
	public Cat(String kind) {
		super(kind);
	}

	private Integer tailLength;

	public Integer getTailLength() {
		return tailLength;
	}

	public void setTailLength(Integer tailLength) {
		this.tailLength = tailLength;
	}

	public void say() {
		System.out.println("мммяяяяууу");
	}

}
