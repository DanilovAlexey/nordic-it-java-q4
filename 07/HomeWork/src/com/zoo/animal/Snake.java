package com.zoo.animal;

public class Snake extends Animal implements Biteable, Huntable {
	public static final String ANIMAL_KIND = "Змея";
	private Integer length;

	public Snake(String name, char sex) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
	}

	public Snake(String name, char sex, Integer length) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
		this.length = length;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void say() {
		System.out.println("шшшшшшшш");
	}

	public void hunt(String victim) {
		System.out.println(ANIMAL_KIND + " охотится на " + victim);

	}

	public void bite(String victim) {
		System.out.println(ANIMAL_KIND + " кусает  " + victim);

	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит c открытыми глазами.");

	}

}
