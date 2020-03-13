package com.zoo.animal;

public class Wolf extends Animal {
	public Wolf(String kind) {
		super(kind);
	}

	private boolean isHungry;

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public void say() {
		System.out.println("yyyyyyy");
	}

}
