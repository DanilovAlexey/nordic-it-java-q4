package com.example;

public class Zoo {

	public static void main(String[] args) {
		var cat = new Cat();
		var cat2 = new Cat();
		var cat3 = new Cat();
		var cat4 = new Cat();
		
		
		cat3.setName("Murzik");
		cat3.setAge(1);
		cat3.setFeed(true);
		System.out.print(cat3.getName()+":");
		System.out.print(cat3.isFeed() + " ");
		cat3.say();
		
		
		cat2.setName("Gav");
		cat2.setAge(3);
		cat3.setFeed(false);
		System.out.print(cat2.getName()+":");
		System.out.print(cat2.isFeed() + " ");
		cat2.say();
		
		
		var tiger = new Tiger();
		tiger.setColor("red");
		tiger.setAge(12);
		tiger.setHungry(false);
		System.out.print("Тигр:" + tiger.getColor() + " " + tiger.getAge() + ". Голодный:" + tiger.isHungry());
		System.out.println("");
		
		var tiger2 = new Tiger();
		tiger2.setColor("blue");
		tiger2.setAge(3);
		tiger2.setHungry(true);
		System.out.print("Тигр:" + tiger2.getColor() + " " + tiger2.getAge() + ". Голодный:" + tiger2.isHungry());
		
		
	}

}
