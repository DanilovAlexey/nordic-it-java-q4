package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class TextWordsCalc {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
		var text = scanner.nextLine();
		var dict = new HashMap<>();

		var textArr = text.split(" ");

		for (var item : textArr) {
			// System.out.println(item);
			/*
			 * if (dict.keySet().contains(item)) { var val = (int) dict.get(item) + 1;
			 * dict.put(item, val); } else { dict.put(item, 1); }
			 */

			dict.putIfAbsent(item, 0);
			var val = (int) dict.get(item) + 1;
			dict.put(item, val);
		}

		System.out.println(dict.entrySet());
		scanner.close();
	}

}
