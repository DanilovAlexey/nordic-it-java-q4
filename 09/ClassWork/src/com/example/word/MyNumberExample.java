package com.example.word;

public class MyNumberExample {

	public static void main(String[] args) {
		var number = new MyNumber(5234);

		for (var digit : number) {
			System.out.println(digit);
		}

	}

}
