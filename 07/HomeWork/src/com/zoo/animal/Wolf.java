package com.zoo.animal;

public class Wolf extends Animal implements Biteable, Huntable {
	public static final String ANIMAL_KIND = "Волк";
	private boolean isHungry;

	public Wolf(String name, char sex) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
	}

	public Wolf(String name, char sex, boolean isHungry) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
		this.isHungry = isHungry;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public void say() {
		System.out.println("yyyyyyy");
	}

	public void hunt(String victim) {
		System.out.println(ANIMAL_KIND + " охотится на " + victim);

	}

	public void bite(String victim) {
		System.out.println(ANIMAL_KIND + " кусает  " + victim);

	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит лежа.");

	}

}
