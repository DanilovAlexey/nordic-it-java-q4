package com.example;

public class Cat {

	private String name;
	private int age;
	private boolean feed;
	
	public void say () {
		System.out.println("meow");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getFeed() {
		return feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}
	
	public String isFeed() {
		if (feed == true) {
			return "покормили";
		} else {
			return "не покормили";
		}
	}
	

}
