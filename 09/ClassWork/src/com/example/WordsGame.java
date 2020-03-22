package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WordsGame {

	public static void main(String[] args) {

		var scoreTable = new HashMap<String, Integer>();
		scoreTable = getScoreTable();

		var playersHistory = new HashMap<>();

		var scanner = new Scanner(System.in);
		var word = "";

		var lettersSet = new HashSet<Character>();
		var wordsHistory = new HashSet<String>();
		var score = new int[2];

		System.out.println("Введите слово:");
		word = scanner.nextLine();

		for (int i = 0; i < word.length(); i++) {
			lettersSet.add(word.charAt(i));
		}

		var wordNew = "";
		var cnt = 0;
		var cntPass = 0;
		var player = "";

		while (cntPass < 2) {
			player = ((cnt % 2 == 0) ? "A" : "B");

			System.out.println("Ходит игрок " + player + ":");
			wordNew = scanner.nextLine();

			if (!(validateWord(wordNew.toCharArray(), lettersSet))) {
				System.out.println("Слово " + wordNew + " не подходит");
				continue;
			}

			if (wordsHistory.contains(wordNew)) {
				System.out.println("Слово " + wordNew + " уже  было");
				continue;
			}

			if (!wordNew.isEmpty() || !wordNew.isBlank()) {
				wordsHistory.add(wordNew);

				playersHistory.putIfAbsent(player, "");
				var words = playersHistory.get(player);
				words += wordNew;
				playersHistory.put(player, words);

				cntPass = 0;
				cnt += 1;
			} else {
				System.out.println("Игрок " + player + " пропускает ход.");
				cntPass += 1;
				cnt += 1;
			}

		}

		score[0] = finalCountdown(scoreTable, playersHistory.get("A").toString());
		score[1] = finalCountdown(scoreTable, playersHistory.get("B").toString());

		if (score[0] == score[1]) {
			System.out.println("Ничья! Счет: " + score[0] + " : " + score[1]);
		} else {
			System.out.println(
					"Победил игрок " + ((score[0] > score[1]) ? "A" : "B") + ". Счет: " + score[0] + " : " + score[1]);
		}

		scanner.close();
	}

	public static boolean validateWord(char[] arr, HashSet<Character> lettersSet) {
		for (var letter : arr) {
			if (!(lettersSet.contains(letter)))
				return false;
		}

		return true;
	}

	public static HashMap<String, Integer> getScoreTable() {
		var map = new HashMap<String, Integer>();
		map.put("А", 10);
		map.put("Б", 3);
		map.put("В", 5);
		map.put("Г", 3);
		map.put("Д", 5);
		map.put("Е", 9);
		map.put("Ж", 2);
		map.put("З", 2);
		map.put("И", 10);
		map.put("Й", 4);
		map.put("К", 6);
		map.put("Л", 4);
		map.put("М", 5);
		map.put("Н", 8);
		map.put("О", 10);
		map.put("П", 6);
		map.put("Р", 6);
		map.put("С", 6);
		map.put("Т", 5);
		map.put("У", 3);
		map.put("Ф", 10);
		map.put("Х", 2);
		map.put("Ц", 1);
		map.put("Ч", 2);
		map.put("Ш", 2);
		map.put("Щ", 1);
		map.put("Ъ", 1);
		map.put("Ы", 2);
		map.put("Ь", 2);
		map.put("Э", 1);
		map.put("Ю", 1);
		map.put("Я", 4);

		return map;
	}

	public static int finalCountdown(HashMap<String, Integer> scoreTable, String playerHistory) {
		var result = 0;
		for (var item : playerHistory.toCharArray()) {
			result += scoreTable.get(String.valueOf(item).toUpperCase());
		}

		return result;
	}

}
