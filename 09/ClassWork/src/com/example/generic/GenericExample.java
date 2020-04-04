package com.example.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericExample {

	public static double average(List<? extends Number> arr) {
		var sum = 0d;

		for (var item : arr) {
			sum += item.doubleValue();
		}

		return sum / arr.size();

	}

	public static void main(String[] args) {
		System.out.println(average(Arrays.asList(5, 10, 15)));
		System.out.println(average(Arrays.asList(0.1, 0.2, 0.3)));
		System.out.println(average(Arrays.asList(100L, 200L, 300L)));

	}

}
