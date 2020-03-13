package com.example;

public class DrawSpinner {

	public static void main(String[] args) {
		var arr = new int[5][5];
		
		for (var i = 0; i < arr.length; i++) {
			for (var j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + (10 * i);
			}
		}
		
		for (var i = 0; i < arr.length; i++) {
			for (var j = 0; j < arr[i].length; j++) {
				 System.out.println(arr[i][j]);
			}
		}
	}

}
