package com.example.films;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class FilmExample {

	public static void main(String[] args) {

		var film1 = new Film("Титаник", 5, "США", 194, "драма");
		var film2 = new Film("Горбатая гора", 4, "США", 134, "драма");
		var film3 = new Film("Ирония судьбы", 5, "СССР", 185, "комедия");
		var film4 = new Film("Интерстеллар", 5, "США", 169, "фантастика");
		var film5 = new Film("Такси", 5, "Франция", 86, "комедия");

		/*
		 * System.out.println(film1.toString()); System.out.println(film2.toString());
		 * System.out.println(film3.toString());
		 */

		TreeSet<Film> filmCollection = new TreeSet<Film>();
		filmCollection.add(film1);
		filmCollection.add(film2);
		filmCollection.add(film3);
		filmCollection.add(film4);
		filmCollection.add(film5);
		/*
		 * for (var film : filmCollection) { System.out.println(film); }
		 */

		ArrayList<Film> filmCollection2 = new ArrayList<Film>();
		filmCollection2.add(film1);
		filmCollection2.add(film2);
		filmCollection2.add(film3);
		filmCollection2.add(film4);
		filmCollection2.add(film5);

		// Collections.sort(filmCollection);
		filmCollection2.sort(new FilmComparator());
		/*
		 * for (var film : filmCollection2) { System.out.println(film); }
		 */

		var myFilmCollection = new FilmCollection();
		myFilmCollection.add(film1);
		myFilmCollection.add(film2);
		myFilmCollection.add(film3);
		myFilmCollection.add(film4);
		myFilmCollection.add(film5);

		for (var film : myFilmCollection) {
			System.out.println(film);
		}

		Iterator<Film> iterator = myFilmCollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
