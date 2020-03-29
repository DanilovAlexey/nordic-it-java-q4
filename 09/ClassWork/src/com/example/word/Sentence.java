package com.example.word;

import java.util.ArrayList;
import java.util.Iterator;

public class Sentence implements Iterable<String> {
	private String sentence;

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new WordIterator();
	}

	public class WordIterator implements Iterator<String> {
		private int posIter = 0;

		@Override
		public boolean hasNext() {
			while (posIter < sentence.length()) {

				if (posIter + 5 > sentence.length())
					break;
				int i = 0;
				for (; i < 5; i++) {
					if (!Character.isLetter(sentence.charAt(posIter + i))) {
						break;
					}

				}

				if (i == 5 && (posIter + 5 < sentence.length() || posIter + 5 == sentence.length())
						&& Character.isWhitespace(sentence.charAt(posIter + 5))) {
					return true;
				}

				while (posIter < sentence.length() && !Character.isLetter(sentence.charAt(posIter)))
					posIter++;

				if (posIter < sentence.length() && Character.isWhitespace(sentence.charAt(posIter)))
					posIter++;
			}
			return false;
		}

		@Override
		public String next() {
			var word = sentence.substring(posIter, posIter + 5);
			posIter += 5;
			return word;
		}

	}

}
