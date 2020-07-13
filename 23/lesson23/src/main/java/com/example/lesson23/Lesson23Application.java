package com.example.lesson23;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;

import org.apache.commons.io.FilenameUtils;
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
		//System.out.println("Heello world");
		//var res = isPalindromExt("белхлеб");
		//System.out.println(res); 
		/*
		Files.walk(Paths.get("C:\\Users\\Алексей\\Desktop\\анализы"))
		.filter(p -> p.getFileName().endsWith("ppt"))
		.forEach(p -> System.out.println(p));
		*/
		
		File file = new File("C:\\Users\\Алексей\\Desktop\\анализы\\1.pdf");
		
		
		var extension = FilenameUtils.getExtension(file.getName());
		
		if (file.exists()) {
			var tempFile = Files.createTempFile(Paths.get("C:\\Users\\Алексей\\Desktop\\анализы\\"), "inordic_", "_temp." + extension);
			Files.copy(Paths.get(file.getPath()), tempFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Файл открылся");
		} else {
			System.err.println("Файла нет");
		}
		
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
		//arr.forEach(System.out::println);
		
		
		

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

	public boolean isPalindromExt(String word) {
		
		if (word == null || word.isBlank())
			return false;
		
		var wordReversed = word.chars()										// IntStream
				.mapToObj(c -> String.valueOf((char) c))					// IntStream -> Stream<String>
				.filter(c -> Character.isLetterOrDigit(c.charAt(0)))		// Stream<String> -> Stream<String>
				.reduce("", (c1, c2) -> c2 + c1, (s1, s2) -> s2 + s1);
				
		System.out.println(wordReversed);
		
		
		return word.equals(wordReversed);
	}
}
