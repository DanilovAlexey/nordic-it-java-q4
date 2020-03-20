package com.zoo;

import com.zoo.animal.*;

public class Main {

	public static void main(String[] args) {
		var cat = new Cat("Стифлер", 'M');
		cat.setTailLength(25);
		
		var raven = new Raven("Андрей", 'M', 35);
		
		var dolph = new Dolphin("Степан", 'M');

		var snake = new Snake("Нагайна", 'F', 50);

		var wolf = new Wolf("Антонина Геннадьевна", 'F');
		wolf.setHungry(true);
		
		
		var frog = new Frog("Лягух", 'M');
		frog.setColor("зеленый");
		
		
		System.out.println(cat.toString());
		System.out.println(raven.toString());
		System.out.println(dolph.toString());
		System.out.println(snake.toString());
		System.out.println(wolf.toString());
		System.out.println(frog.toString());
		
		
		/*
		System.out.println(cat.toString());
		cat.say();
		System.out.println("Хвост: " + cat.getTailLength() + " см.");
*/
		System.out.println("");
/*
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
		
		System.out.println("");

		var frog = new Frog("Лягушка");
		frog.setName("Лягух");
		frog.setSex('M');
		System.out.println(frog.toString());
		frog.say();
		frog.setColor("зеленый");
		System.out.println("Цвет: " + frog.getColor());
		*/
	}

}
