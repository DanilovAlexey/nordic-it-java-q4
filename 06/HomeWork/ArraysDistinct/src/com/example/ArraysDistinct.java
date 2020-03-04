package com.example;

public class ArraysDistinct {

	public static void main(String[] args) {
		var array = new int[] { 1, 1, 1, 1, 2, 2, 3, 4, 5 };
		var result = dropDuplicates(array);
		for (var item : result) {
			System.out.print(item);
		}
	}

	public static int[] dropDuplicates(int[] arr) {
		var arrSec = new int[arr.length][2];
		var copiesCounter = 0;

		for (int i = 0; i < arr.length; i++) {
			arrSec[i][0] = arr[i];
			for (var j = 0; j < i; j++) {
				if (arrSec[j][0] == arr[i]) {
					arrSec[i][1] = 1;
					copiesCounter += 1;
					break;
				}
			}
		}

		var result = new int[arr.length - copiesCounter];
		var resCounter = 0;
		for (var item : arrSec) {
			if (item[1] == 0) {
				result[resCounter] = item[0];
				resCounter += 1;
			}
		}

		return result;
	}
}
