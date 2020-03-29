package com.example.word;

import java.util.Iterator;

public class MyNumber implements Iterable<Integer> {
	private Integer data;

	public MyNumber() {
		super();
	}

	public MyNumber(Integer data) {
		super();
		this.data = data;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new DigitIterator();
	}

	public class DigitIterator implements Iterator<Integer> {

		private int dataCopy = data;
		private int remain;
		private int range = 1;

		public DigitIterator() {
			super();
			while (dataCopy / 10 > 0) {
				range *= 10;
				dataCopy = dataCopy / 10;
			}

			dataCopy = data;

		}

		@Override
		public boolean hasNext() {
			return dataCopy % 10 > 0;
		}

		@Override
		public Integer next() {
			remain = dataCopy / range;
			dataCopy = dataCopy % range;
			range = range / 10;
			return remain;
		}

	}

}
