package com.example.parking.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Parking {

	private HashMap<Integer, Boolean> parking;

	public Parking() {
		parking = new HashMap<Integer, Boolean>();

		for (var i = 1; i <= 4; i++) {
			parking.put(i, false);
		}

	}

	public ArrayList<Integer> getFreePlaces() {
		var freeList = new ArrayList<Integer>();

		for (var key : parking.keySet())
			if (!parking.get(key))
				freeList.add(key);

		return freeList;

	}

	public int setPlaceReserved() {
		if (!getFreePlaces().isEmpty()) {
			var place = getFreePlaces().get(0);
			parking.put(place, true);
			return place;
		}
		
		return -1;
	}

	public boolean setPlaceFree(int id) {
		if (parking.containsKey(id)) {
			parking.put(id, false);
			return true;
		}

		return false;
	}
}
