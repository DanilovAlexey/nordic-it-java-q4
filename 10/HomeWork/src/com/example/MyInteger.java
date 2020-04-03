package com.example;

import java.util.ArrayList;
import java.util.HashSet;

public class MyInteger implements Comparable<MyInteger> {
	public static final String TASK = "Создать класс целых чисел MyInteger с порядком на основе количества различных (!) цифр в десятичном представлении.";
	private int number;

	public MyInteger(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int compareTo(MyInteger o) {
		if (getCountDistinct(this.number) == getCountDistinct(o.getNumber()))
			return getCount(this.number).compareTo(getCount(o.getNumber()));
		return getCountDistinct(this.number).compareTo(getCountDistinct(o.getNumber()));
	}

	public Integer getCountDistinct(int number) {
		var set = new HashSet<Integer>();

		while (number / 10 > 0) {
			set.add(number % 10);
			number = number / 10;
		}
		set.add(number);

		return set.size();
	}

	public Integer getCount(int number) {
		var arr = new ArrayList<Integer>();

		while (number / 10 > 0) {
			arr.add(number % 10);
			number = number / 10;
		}
		arr.add(number);

		return arr.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.valueOf(this.number);
	}

}
