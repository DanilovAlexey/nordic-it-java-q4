package com.example.lesson23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.example.lesson23.TextUtils.*;

@SpringBootApplication
public class Lesson23Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lesson23Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Heello world");

		/*
		System.out.println(isPalindrom(null)); // false
		System.out.println(isPalindrom("Лол")); // true
		System.out.println(isPalindrom("яя"));
		System.out.println(isPalindrom("батон"));

		System.out.println(isPalindrom(""));
		System.out.println(isPalindrom("   "));
		System.out.println(isPalindrom("я"));

*/
		
		var scanner = new Scanner(System.in);
		
		var arr = new ArrayList<String>();
		
		
		String line = scanner.nextLine();
		
		while (!line.isEmpty()) {
			arr.add(line);
			line = scanner.nextLine();
		}
		
		sortByLength(arr);
		for (var item : arr)
			System.out.println(item);

		scanner.close();
/*
		arr.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
			
		});
	*/
		
		//arr.forEach(t -> System.out.println(t));
		arr.forEach(System.out::println);

	}

	public boolean isPalindrom(String str) {

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
