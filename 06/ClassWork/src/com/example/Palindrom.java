package com.example;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var word = scanner.nextLine();
		
		System.out.println(isPalindrom(word.replaceAll(" ", "")));

		scanner.close();

	}

	
	public static boolean isPalindrom(String word) {
		if (word.length() == 0) {
			return true;
		} else if (word.length() == 1) {
			return true;
		} else if (word.charAt(0) != word.charAt(word.length() - 1)) {
			return false;
		} else {			
			return isPalindrom(word.substring(1, word.length() - 1));
		}				
	}
}
