package com.zoo;

import com.zoo.animal.*;
import com.zoo.aviaries.Aviaries;
import com.zoo.exceptions.InvalidAviary;
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
			System.out.println("Прыгаем на отрицательное значение");
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
			System.out.println("Передаем недопустимый пол животного");
			frog.setSex('J');
		} catch (InvalidSexValue e) {
			e.printStackTrace();
		}
		frog.setColor("зеленый");

		var cat2 = new Cat("Мурка");
		var cat3 = new Cat("Барсик");
		var cat4 = new Cat("Вася");

		System.out.println("Всего объявлено животных:");
		System.out.println(cat.toString());
		System.out.println(raven.toString());
		System.out.println(dolph.toString());
		System.out.println(snake.toString());
		System.out.println(wolf.toString());
		System.out.println(frog.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());
		System.out.println(cat4.toString());
		System.out.println("");

		System.out.println("Создаем вольеры");
		var aviary = Aviaries.getInstance();

		aviary.createAviary(Cat.ANIMAL_KIND);
		aviary.createAviary(Wolf.ANIMAL_KIND);
		aviary.createAviary(Dolphin.ANIMAL_KIND);

		System.out.println("Созданы пустые вольеры: " + aviary.getAviariesList());

		System.out.println("Заполняем вольеры животными ");
		try {
			aviary.addAnimalToAviary(cat);
			aviary.addAnimalToAviary(cat2);
			aviary.addAnimalToAviary(cat3);
			aviary.addAnimalToAviary(cat4);

			aviary.addAnimalToAviary(wolf);

			aviary.addAnimalToAviary(frog);
		} catch (InvalidAviary e) {
			e.printStackTrace();
		}

		System.out.println("Итого животные в вольере: " + aviary.getAviariesList());
	}

}
