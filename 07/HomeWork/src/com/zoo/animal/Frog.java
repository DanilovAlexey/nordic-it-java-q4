package com.zoo.animal;

import com.zoo.exceptions.NegativeValueException;

public class Frog extends Animal implements Huntable, Jumpable {
	public static final String ANIMAL_KIND = "Лягушка";
	private String color;

	public Frog(String name) {
		super(name);
		this.setKind(ANIMAL_KIND);
	}

	public Frog(String name, String color)  {
		super(name);
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

	public void jump(float meters) throws NegativeValueException {
		if (meters < 0)
			throw new NegativeValueException("Невозможно прыгнуть на отрицательное число метров");
		
		System.out.println(ANIMAL_KIND + " прыгнула на " + meters + " метров");
	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит сидя.");

	}

	public void hunt(String victim) {
		System.out.println(ANIMAL_KIND + " охотиться на " + victim);
	}
}
