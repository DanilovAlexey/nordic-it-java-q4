package com.zoo.animal;

import java.text.MessageFormat;

import com.zoo.exceptions.InvalidSexValue;

public abstract class Animal {
	private String kind;
	private String name;
	private char sex;

	public Animal(String name) {
		this.name = name;
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

	public void setSex(char sex) throws InvalidSexValue  {
		if (sex != 'M' && sex != 'F')
			throw new InvalidSexValue("Недопустимое значение пола. Возможные варианты: ['F', 'M']");
		this.sex = sex;
	}

	public abstract void say();
	public abstract void sleep();
	
	public void eat() {
		System.out.println(this.getKind() + " поел. ");
	}
	
	public void eat(float gramm, String food) {
		System.out.println(this.getKind() + " поел " + gramm + " " + food);
	}
	
	public String toString() {
		Object[] params = new Object[] { this.getKind(), this.getName(), this.getSex() };
		String msg = MessageFormat.format("{0}:(Имя:{1}, Пол:{2})", params);

		return msg;
	}

}
