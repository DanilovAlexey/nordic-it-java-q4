package com.zoo.animal;

public class Dolphin extends Animal {

	public Dolphin(String kind) {
		super(kind);
	}

	public void say() {
		System.out.println("уиииуиииуии");
	}

	public void jump() {
		System.out.println("выпрыгнул из воды");
	}

	public void dive() {
		System.out.println("нырнул в воду");
	}
}
