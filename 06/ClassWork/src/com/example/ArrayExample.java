package com.example;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		/*
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/

		for (var elem : array) {
			System.out.println(elem);
		}
	}

}
