package com.zoo;

import com.zoo.animal.*;
import com.zoo.exceptions.InvalidSexValue;
import com.zoo.exceptions.NegativeValueException;

public class Main {

	public static void main(String[] args) {
		var cat = new Cat("Стифлер");
		try {
			cat.setSex('M');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}
		cat.setTailLength(25);
		try {
			cat.jump(-5);
		} catch (NegativeValueException e1) {
			e1.printStackTrace();
		}

		var raven = new Raven("Андрей", 35);
		try {
			raven.setSex('M');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}

		var dolph = new Dolphin("Степан");
		try {
			dolph.setSex('M');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}

		var snake = new Snake("Нагайна", 50);
		try {
			snake.setSex('F');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}

		var wolf = new Wolf("Антонина Геннадьевна");
		try {
			wolf.setSex('F');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}
		wolf.setHungry(true);

		var frog = new Frog("Лягух");
		try {
			frog.setSex('J');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}
		frog.setColor("зеленый");

		System.out.println(cat.toString());
		System.out.println(raven.toString());
		System.out.println(dolph.toString());
		System.out.println(snake.toString());
		System.out.println(wolf.toString());
		System.out.println(frog.toString());


		System.out.println("");
	}

}
