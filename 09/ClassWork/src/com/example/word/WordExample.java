package com.example.word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordExample {

	public static void main(String[] args) {
		//var scanner = new Scanner(System.in);

		//var wordCollection = new ArrayList<Word>();

		//var input = scanner.nextLine();
		/*
		for (var word : input.split(" ")) {
			wordCollection.add(new Word(word));
		}

		Collections.sort(wordCollection, Collections.reverseOrder());

		for (var word : wordCollection) {
			System.out.println(word);
		}*/

		var str  = "азорап";
		
		var sent = new Sentence(str);
		
		for ( var word : sent) {
			System.out.println(word);
		}
		
		
		//scanner.close();

	}

}
