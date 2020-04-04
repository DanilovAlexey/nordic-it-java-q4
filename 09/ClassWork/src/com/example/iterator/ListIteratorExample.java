package com.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorExample {
	
	
	public static void main(String[] args) {
		
		var array = new  ArrayList<Double>();
		
		array.add(5d);
		array.add(10d);
		array.add(15d);
		array.add(5d);
		array.add(10d);
		array.add(15d);
		
		Iterator<Double> iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			//array.remove(0);			// так будет ошибка
			double res = iterator.next();
			if (res == 5d)
				iterator.remove();			// так нет
		}
	}
}
