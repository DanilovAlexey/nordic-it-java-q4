package com.example.task23;

import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task23Application {

	public static void main(String[] args) {
		SpringApplication.run(Task23Application.class, args);

		System.out.println(countNumbers("001111001"));
	}

	public static int countNumbers(String str) {

		var arr = new ArrayList<Integer>();

		var counter = 0;
		for (var i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '1') {
				counter += 1;
			} else {
				arr.add(counter);
				counter = 0;
			}
		}
		arr.add(counter);
		/*
		 * arr.sort(new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { return 0; }
		 * 
		 * });
		 */
		arr.sort((a, b) -> Integer.compare(a, b));

		return arr.get(arr.size() - 1);
	}

}
