package com.example;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var input = scanner.nextInt();
		System.out.println(getFactorial(input));
		System.out.println(fibonachiNumber(input));

		scanner.close();

	}
	
	public static int getFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return  n * getFactorial(n - 1);
		}
	}
	
	public static int fibonachiNumber(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonachiNumber(n - 1) + fibonachiNumber(n - 2);
		}
	}
	
	


}
