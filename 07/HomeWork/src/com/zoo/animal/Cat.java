package com.zoo.animal;

import com.zoo.exceptions.NegativeValueException;

public class Cat extends Animal implements Huntable, Jumpable {
	public static final String ANIMAL_KIND = "Кошка";
	private Integer tailLength;

	public Cat(String name) {
		super(name);
		this.setKind(ANIMAL_KIND);
	}

	public Cat(String name, Integer tailLength) {
		super(name);
		this.setKind(ANIMAL_KIND);
		this.tailLength = tailLength;
	}

	public Integer getTailLength() {
		return tailLength;
	}

	public void setTailLength(Integer tailLength) {
		this.tailLength = tailLength;
	}

	public void say() {
		System.out.println("мммяяяяууу");
	}

	public void jump(float meters) throws NegativeValueException {
		if (meters < 0)
			throw new NegativeValueException("Невозможно прыгнуть на отрицательное число метров");
		System.out.println(ANIMAL_KIND + " прыгнула на " + meters + " метров");
	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит лежа.");

	}

	public void hunt(String victim) {
		System.out.println(ANIMAL_KIND + " охотиться на " + victim);

	}

}
