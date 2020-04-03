package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		System.out.println("ЗАДАНИЕ 1");
		System.out.println(MyInteger.TASK);

		var arr = new ArrayList<MyInteger>();
		arr.add(new MyInteger(12345));
		arr.add(new MyInteger(112233));
		arr.add(new MyInteger(111222));
		arr.add(new MyInteger(555555));
		arr.add(new MyInteger(1));
		arr.add(new MyInteger(9966321));

		System.out.println("");
		System.out.println("Исходный список");
		for (var nmb : arr) {
			System.out.println(nmb + " " /* + MyInteger.getCount(nmb.getNumber()) */);
		}

		System.out.println("");
		System.out.println("Отсортированный список по кол-ву уникальных цифр (если одинаково, то по общему кол-ву)");
		Collections.sort(arr);
		for (var nmb : arr) {
			System.out.println(nmb + " " /* + MyInteger.getCount(nmb.getNumber()) */);
		}

		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("ЗАДАНИЕ 2");
		System.out.println(Matrix.TASK);

		var mat = new int[][] { { 11, 12 } };

		var mat0 = new int[][] { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 } };

		var mat1 = new int[][] { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 } };

		var mat2 = new int[][] { { 11, 12 }, { 21, 22, }, { 31, 32, }, { 41, 42, }, { 51, 52, } };

		var mat3 = new int[][] { { 11, 12 }, { 21, 22, }, { 31, 32, }, { 41, 42, }, { 51, 52, }, { 61, 62, } };

		var mat4 = new int[][] { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, };

		var mat5 = new int[][] { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
				{ 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 }, { 61, 62, 63, 64, 65 } };

		System.out.println("");
		var matrix = new Matrix(mat);
		System.out.println("Матрица:");
		matrix.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

		var matrix0 = new Matrix(mat0);
		System.out.println("Матрица 0:");
		matrix0.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix0) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

		var matrix1 = new Matrix(mat1);
		System.out.println("Матрица 1:");
		matrix1.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix1) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

		var matrix2 = new Matrix(mat2);
		System.out.println("Матрица 2:");
		matrix2.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix2) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

		var matrix3 = new Matrix(mat3);
		System.out.println("Матрица 3:");
		matrix3.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix3) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

		var matrix4 = new Matrix(mat4);
		System.out.println("Матрица 4:");
		matrix4.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix4) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

		var matrix5 = new Matrix(mat5);
		System.out.println("Матрица 5:");
		matrix5.printMatrix();

		System.out.print("Результат => ");
		for (var item : matrix5) {
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("");

	}

}
