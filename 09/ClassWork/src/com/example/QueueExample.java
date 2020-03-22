package com.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueExample {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var input = scanner.nextLine();
		var inputArr = input.toCharArray();

		var hist = new ArrayDeque<String>();
		hist.add(String.valueOf(inputArr[0]));

		for (int i = 1; i < inputArr.length; i++) {
			var item = inputArr[i];

			if (hist.isEmpty()) {
				hist.add(String.valueOf(item));
				continue;
			}

			var last = hist.getLast();
			var opposite = "";

			switch (item) {
			case ')':
				opposite = "(";
				if (last.equals(opposite)) {
					hist.removeLast();
				} else {
					hist.add(String.valueOf(item));
				}
				break;
			case '}':
				opposite = "{";
				if (last.equals(opposite)) {
					hist.removeLast();
				} else {
					hist.add(String.valueOf(item));
				}
				break;
			case ']':
				opposite = "[";
				if (last.equals(opposite)) {
					hist.removeLast();
				} else {
					hist.add(String.valueOf(item));
				}
				break;
			default:
				hist.add(String.valueOf(item));
			}
		}

		if (hist.isEmpty()) {
			System.out.println("Закрылся");
		} else {
			System.out.println(hist);
		}

		scanner.close();
	}

}
