package com.example;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Matrix implements Iterable<Integer> {
	public static final String TASK = "Создать класс матриц Matrix с итератором, проходящим матрицу в спиральном порядке.";
	private int[][] matrix;

	public Matrix(int[][] matrix) {
		super();
		this.matrix = matrix;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void printMatrix() {
		for (var item : matrix) {
			for (int i = 0; i < item.length; i++) {
				System.out.print(item[i] + " ");
			}
			System.out.println("");
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MatrixIterator();
	}

	public class MatrixIterator implements Iterator<Integer> {
		private ArrayDeque<Integer> sortedData = sortMatrix(matrix);

		@Override
		public boolean hasNext() {
			return !sortedData.isEmpty();
		}

		@Override
		public Integer next() {
			return sortedData.pollFirst();
		}

		private ArrayDeque<Integer> sortMatrix(int[][] matrix) {
			int rows, cols, p, s;

			var arr = new ArrayDeque<Integer>();

			rows = matrix.length;
			cols = matrix[0].length;
			p = (rows == cols) ? 4 * rows - 4 : 2 * (rows + cols) - 4;
			s = rows * cols;

			var iRow = 0;
			var iCol = 0;
			var cnt = 0;
			var sCounter = 0;
			do {
				iCol = cnt;
				iRow = cnt;
				for (int j = iCol; j < cols + cnt; j++) {
					if (s == sCounter)
						break;
					arr.add(matrix[iRow][j]);
					sCounter += 1;
				}

				iCol = cols - 1 + cnt;
				iRow += 1;
				for (int i = iRow; i < rows + cnt; i++) {
					if (s == sCounter)
						break;
					arr.add(matrix[i][iCol]);
					sCounter += 1;
				}

				iCol -= 1;
				iRow = rows - 1 + cnt;
				for (int j = iCol; j >= cnt; j--) {
					if (s == sCounter)
						break;
					arr.add(matrix[iRow][j]);
					sCounter += 1;
				}

				iCol = cnt;
				iRow -= 1;
				for (int i = iRow; i > cnt; i--) {
					if (s == sCounter)
						break;
					arr.add(matrix[i][iCol]);
					sCounter += 1;
				}

				cnt += 1;
				rows -= 2;
				cols -= 2;
				if (cols <= 0 || rows <= 0)
					break;
				p = (rows == cols) ? 4 * rows - 4 : 2 * (rows + cols) - 4;
			} while (p >= 0);
			return arr;
		}
	}

}
