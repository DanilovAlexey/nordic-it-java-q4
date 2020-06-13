package com.example.lesson23;

public class Palindrom {

	public static boolean isPalindrom(String str) {

		if (str == null || str.isBlank()) {
			return false;
		} else {

			str = str.toLowerCase();

			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - i - 1))
					return false;
			}
		}
		return true;
	}
}
