package com.zoo.animal;

public class Snake extends Animal {
	public Snake(String kind) {
		super(kind);
	}

	private Integer length;

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void say() {
		System.out.println("шшшшшшшш");
	}

}
