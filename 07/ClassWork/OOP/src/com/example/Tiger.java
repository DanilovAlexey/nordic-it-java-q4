package com.example;

public class Tiger {
	private String color;
	private int age;
	private boolean isHungry;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	public void say() {
		System.out.println("roar");
	}
	
}
