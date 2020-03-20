package com.zoo.animal;

public class Frog extends Animal implements Huntable, Jumpable {
	public static final String ANIMAL_KIND = "Лягушка";
	private String color;

	public Frog(String name, char sex) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
	}

	public Frog(String name, char sex, String color) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void say() {
		System.out.println("квааааа");
	}

	public void jump(float meters) {
		System.out.println(ANIMAL_KIND + " прыгнула на " + meters + " метров");
	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит сидя.");

	}

	public void hunt(String victim) {
		System.out.println(ANIMAL_KIND + " охотиться на " + victim);
	}
}
