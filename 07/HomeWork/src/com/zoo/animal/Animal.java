package com.zoo.animal;

import java.text.MessageFormat;

public class Animal {
	private String kind;
	private String name;
	private char sex;

	public Animal(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void say() {
		System.out.println("");
	}

	public String toString() {
		Object[] params = new Object[] { this.getKind(), this.getName(), this.getSex() };
		String msg = MessageFormat.format("{0}:(Имя:{1}, Пол:{2})", params);

		return msg;
	}

}
