package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxExample {

	public static void change(Box<?> box) {

	}

	public static int sumArrayList(Box<? extends ArrayList<Integer>> box) {
		int sum = 0;
		for (Integer elem : box.getData())
			sum += elem;
		return sum;
	}

	public static <T extends Number> void print(T elem) {
		T newElem = elem;
		System.out.println(elem.doubleValue());
	}

	public static void main(String[] args) {
		var box = new Box<ArrayList<Integer>>();
		var arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
		box.setData(arrayList);
		System.out.println(arrayList);

		System.out.println(sumArrayList(box));
	}

}
