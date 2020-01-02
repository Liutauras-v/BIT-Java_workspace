package lt.pkg;

import java.util.Scanner;

public class MatrixDeterminant {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int matrix[][] = {

				{ 1, 0, 2, -1 },

				{ 3, 0, 0, 5 },

				{ 2, 1, 4, -3 },

				{ 1, 0, 5, 0 }, };

		System.out.print("Use pre-set matrix? (y/n): ");
		if (!askForBool(scan)) {
			matrix = remakeMatrix(scan);
		}

		System.out.println("Result: " + determinant(matrix));
		scan.close();
	}

	public static boolean askForBool(Scanner scan) {

		while (true) {
			String in = scan.next();
			if (in.toLowerCase().equals("y")) {
				return true;
			} else if (in.toLowerCase().equals("n")) {
				return false;
			} else {
				System.out.print("Try again with \"y\" or \"n\": ");
			}
		}
	}

	public static int[][] remakeMatrix(Scanner scan) {

		System.out.print("Enter length of the new matrix: ");
		int len = 0;

		try {
			len = Integer.parseInt(scan.next());
		} catch (Exception e) {
			System.out.println("Thats not a number...\n");
			return remakeMatrix(scan);
		}

		if (len <= 0) {
			System.out.println("Number is too small... try again..\n");
			return remakeMatrix(scan);
		}

		System.out.println("\nUse \"space\" as a separator and \"enter\" to end line");
		System.out.println("Write " + len + " numbers in " + len + " lines");

		int[][] newMat = new int[len][len];
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(System.in); // paklausti cia
		for (int i = 0; i < len; i++) {

			String temp = scan2.nextLine();
			String[] arr = temp.split(" ");
			int[] row = new int[len];

			if (arr.length != len) {
				System.out.println("You fucked up somewhere, try again...\n");
				return remakeMatrix(scan);
			}

			for (int j = 0; j < len; j++) {
				try {
					row[j] = Integer.parseInt(arr[j].trim());
				} catch (Exception e) {
					System.out.println("You fucked up somewhere, try again...\n");
					return remakeMatrix(scan);
				}
				newMat[i] = row;
			}

		}
		return newMat;
	}

	public static int determinant(int[][] matrix) {
		int sum = 0;
		int s;
		if (matrix.length == 1) {
			return (matrix[0][0]);
		}
		for (int i = 0; i < matrix.length; i++) {
			int[][] smaller = new int[matrix.length - 1][matrix.length - 1];
			for (int a = 1; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					if (b < i) {
						smaller[a - 1][b] = matrix[a][b];
					} else if (b > i) {
						smaller[a - 1][b - 1] = matrix[a][b];
					}
				}
			}
			if (i % 2 == 0) {
				s = 1;
			} else {
				s = -1;
			}
			sum += s * matrix[0][i] * (determinant(smaller));
		}
		return (sum);
	}

}
