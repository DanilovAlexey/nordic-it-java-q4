package com.example.lesson23;

import java.util.ArrayList;
import java.util.Comparator;

public class TextUtils {

	public static void sortByLengthOld(ArrayList<String> arr) {
		arr.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
	}
	
	public static void sortByLength(ArrayList<String> arr) {
		arr.sort(
				(o1, o2) -> {
					return Integer.compare(o1.length(), o2.length());
				}
		);
	}
	
	public static void sortByLengthNew(ArrayList<String> arr) {
		arr.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
	}
	
}
