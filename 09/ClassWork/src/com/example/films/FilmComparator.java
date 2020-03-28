package com.example.films;

import java.util.Comparator;

public class FilmComparator implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		if (o1.getRating().equals(o2.getRating())) {
			if (o1.getTime().equals(o2.getTime())) {
				return o1.getTime().compareTo(o2.getTime());
			} else {
				return o1.getTime().compareTo(o2.getTime());
			}
		} else {
			return (o1.getRating().compareTo(o2.getRating()));
		}
	}

}
