package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var cnt = scanner.nextInt();

		var arr = new ArrayList<Integer>();
		for (var i = 0; i < cnt; i++)
			arr.add(scanner.nextInt());

		var max = arr.get(0);
		var min = arr.get(0);
		var sum = 0;
		var avg = 0f;

		for (var item : arr) {
			if (item > max)
				max = item;
			if (item < min)
				min = item;
			sum += item;
		}

		avg = (float) sum / cnt;

		System.out.println("Макс. число " + max);
		System.out.println("Мин. число " + min);
		System.out.println("Ср. число " + avg);

		scanner.close();
	}
	
}
