package com.zoo.animal;

public class Raven extends Animal implements Flyable {
	public static final String ANIMAL_KIND = "Ворон";
	private Integer size;

	public Raven(String name, char sex) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
	}

	public Raven(String name, char sex, Integer size) {
		super(name, sex);
		this.setKind(ANIMAL_KIND);
		this.size = size;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void say() {
		System.out.println("кааааррррр");
	}

	public void fly(float kilometers) {
		System.out.println(ANIMAL_KIND + " пролетел " + kilometers + " километров.");

	}

	public void sleep() {
		System.out.println(ANIMAL_KIND + " спит сидя на ветке.");

	}

}
