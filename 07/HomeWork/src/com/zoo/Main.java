package com.zoo;

import com.zoo.animal.*;

public class Main {

	public static void main(String[] args) {
		var cat = new Cat("Кот");
		cat.setName("Стифлер");
		cat.setSex('M');
		System.out.println(cat.toString());
		cat.say();
		cat.setTailLength(25);
		System.out.println("Хвост: " + cat.getTailLength() + " см.");

		System.out.println("");

		var raven = new Raven("Ворон");
		raven.setName("Андрей");
		raven.setSex('M');
		System.out.println(raven.toString());
		raven.say();
		raven.setSize(35);
		System.out.println("Размер: " + raven.getSize() + " см.");

		System.out.println("");

		var dolph = new Dolphin("Дельфин");
		dolph.setName("Степан");
		dolph.setSex('M');
		System.out.println(dolph.toString());
		dolph.say();
		dolph.jump();
		dolph.dive();

		System.out.println("");

		var snake = new Snake("Змея");
		snake.setName("Нагайна");
		snake.setSex('F');
		System.out.println(snake.toString());
		snake.say();
		snake.setLength(50);
		System.out.println("Длина: " + snake.getLength() + " см.");

		System.out.println("");

		var wolf = new Wolf("Волк");
		wolf.setName("Антонина Геннадьевна");
		wolf.setSex('F');
		System.out.println(wolf.toString());
		wolf.say();
		wolf.setHungry(true);
		System.out.println("Голодный: " + wolf.isHungry());
	}

}
