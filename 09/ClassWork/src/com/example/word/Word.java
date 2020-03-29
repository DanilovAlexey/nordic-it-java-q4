package com.example.word;

public class Word implements Comparable<Word> {

	private String word;

	public Word(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int compareTo(Word o) {
		return (getCount(this.getWord()).compareTo(getCount(o.getWord())));

	}

	public Integer getCount(String input) {
		var i = 0;
		for (var item : input.toCharArray()) {
			if (item == 'а')
				i++;

		}
		return i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.word;
	}

}
