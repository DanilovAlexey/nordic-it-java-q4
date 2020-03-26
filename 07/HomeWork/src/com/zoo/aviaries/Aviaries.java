package com.zoo.aviaries;

import java.util.ArrayList;
import java.util.HashMap;
import com.zoo.animal.Animal;
import com.zoo.exceptions.InvalidAviary;

public class Aviaries {
	private static final Aviaries INSTANCE = new Aviaries();
	private HashMap<String, ArrayList<Object>> aviariesList;

	private Aviaries() {
		aviariesList = new HashMap<String, ArrayList<Object>>();
	}

	public static Aviaries getInstance() {
		return INSTANCE;
	}

	public void createAviary(String animal) {
		aviariesList.putIfAbsent(animal, new ArrayList<Object>());
	}

	public HashMap<String, ArrayList<Object>> getAviariesList() {
		return aviariesList;
	}

	public void addAnimalToAviary(Animal animal) throws InvalidAviary {
		if (!(aviariesList.containsKey(animal.getKind())))
			throw new InvalidAviary("Вольер для животного " + animal.getKind() + " отсутствует!");

		var animals = aviariesList.get(animal.getKind());
		animals.add(animal);
		aviariesList.put(animal.getKind(), animals);
	}
}
