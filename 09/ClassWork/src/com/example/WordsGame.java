package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class WordsGame {

	public static HashSet<Character> letters;

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
		var word = "";

		letters = new HashSet<Character>();
		var wordsHistory = new HashSet<String>();
		var score = new int[2];

		System.out.println("Введите слово:");
		word = scanner.nextLine();

		for (int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}

		var wordNew = "";
		var cnt = 0;
		var cntPass = 0;

		while (cntPass < 2) {
			System.out.println("Ходит игрок " + ((cnt % 2 == 0) ? "A" : "B") + ":");
			wordNew = scanner.nextLine();

			if (!(validateWord(wordNew.toCharArray()))) {
				System.out.println("Слово " + wordNew + " не подходит");
				continue;
			}

			if (wordsHistory.contains(wordNew)) {
				System.out.println("Слово " + wordNew + " уже  было");
				continue;
			}

			if (!wordNew.isEmpty() || !wordNew.isBlank()) {
				wordsHistory.add(wordNew);
				if ((cnt % 2 == 0))
					score[0] += 1;
				else
					score[1] += 1;

				cntPass = 0;
				cnt += 1;
			}

			if (wordNew.isEmpty() || wordNew.isBlank()) {
				System.out.println("Игрок " + ((cnt % 2 == 0) ? "A" : "B") + " пропускает ход.");
				cntPass += 1;
				cnt += 1;
			}
		}

		if (score[0] == score[1]) {
			System.out.println("Ничья! Счет: " + score[0] + " : " + score[1]);
		} else {
			System.out.println(
					"Победил игрок " + ((score[0] > score[1]) ? "A" : "B") + ". Счет: " + score[0] + " : " + score[1]);
		}

		scanner.close();
	}

	public static boolean validateWord(char[] arr) {
		for (var letter : arr) {
			if (!(letters.contains(letter)))
				return false;
		}

		return true;
	}

}
