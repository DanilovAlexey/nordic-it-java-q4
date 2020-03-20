package com.zoo.animal;


public class Dolphin extends Animal implements Huntable, Swimable {
	public static final String ANIMAL_KIND = "Дельфин";

	public Dolphin(String name) {
		super(name);
		this.setKind(ANIMAL_KIND);
	}

	public void say() {
		System.out.println("уиии-уиии-уии");
	}

	public void dive(int meters) {
		System.out.println(ANIMAL_KIND + " нырнул в воду на " + meters + " метров.");
	}

	public void jumpFromWater(float meters) {
		System.out.println(ANIMAL_KIND + " выпрыгнул из воды на " + meters + " метров.");

	}

	public void hunt(String victim) {
		System.out.println(ANIMAL_KIND + " охотиться на " + victim);

	}

	public void eat(float gramm) {
		System.out.println(ANIMAL_KIND + " съел " + gramm + " еды.");

	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит полушариями.");

	}
}
