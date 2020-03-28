package com.example.films;

import java.util.Iterator;

public class FilmCollection implements Iterable<Film> {
	private Film[] data;
	private int pos;

	public FilmCollection() {
		this.data = new Film[10];
	}

	public void add(Film film) {
		if (pos >= 10) {
			throw new IllegalStateException("Много фильмов");
		}
		data[pos++] = film;
	}

	@Override
	public Iterator<Film> iterator() {
		return new FilmIterator();
	}

	private class FilmIterator implements Iterator<Film> {

		private int posIter = 0;
		
		@Override
		public boolean hasNext() {
			while (posIter < pos && !data[posIter].getCountry().equals("США"))
					posIter++;
			return posIter < pos;
		}

		@Override
		public Film next() {
			return data[posIter++];
		}
	}
}
