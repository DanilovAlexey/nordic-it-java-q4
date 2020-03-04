package com.example;

import java.util.Scanner;

public class ArraysCompare {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int[] arrFirst = new int[8];
		int[] arrSecond = new int[8];

		for (int i = 0; i < arrFirst.length; i++) {
			arrFirst[i] = scanner.nextInt();
		}

		for (int i = 0; i < arrSecond.length; i++) {
			arrSecond[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println(compareArrs(arrFirst, arrSecond));
		

	}

	public static String compareArrs(int[] arrF, int[] arrS) {
		int[] positions = new int[arrF.length];

		for (int item : arrF) {
			for (int i = 0; i < arrS.length; i++) {
				if (positions[i] != 0) {
					continue;
				} else if (item == arrS[i]) {
					positions[i] = 1;
					break;
				}
			}
		}

		int sum = 0;
		for (int item : positions) {
			sum += item;
		}

		if (sum == positions.length) {
			return "yes";
		} else {
			return "no";
		}
	}

}
