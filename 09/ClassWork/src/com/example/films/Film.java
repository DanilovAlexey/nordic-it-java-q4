package com.example.films;

public class Film implements Comparable<Film> {

	private String name;
	private Integer rating;
	private String country;
	private Integer time; // минут
	private String genre;

	public Film() {
		super();
	}

	public Film(String name, Integer rating, String country, Integer time, String genre) {
		super();
		this.name = name;
		this.rating = rating;
		this.country = country;
		this.time = time;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Film [name = " + name + ", rating = " + rating + ", country =" + country + ", time = " + time
				+ ", genre = " + genre;
	}

	@Override
	public int compareTo(Film o) {
		// рейтинг, длит, страна
		if (this.rating.equals(o.rating)) {
			if (this.time.equals(o.time)) {
				return this.country.compareTo(o.country);
			} else {
				return this.time.compareTo(time);
			}
		} else {
			return (this.rating.compareTo(o.rating));
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Film other = (Film) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}



	
}
