package Programs;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		bubbleSort();
		largestAterSorting();
		arrSearch();
		arraySearch();
		int a[][] = { { 1, 2, 3 },
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		matrixMultiplication(a, b);
		triplet();

		merge();
		roateToRight();
		additionOfDigonal(a);

	}

	public static void bubbleSort() {
		int[] a = { 10, 30, 50, 70, 20 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println("Printing array with the help of bubblesort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("======================================================");

	}

	public static void largestAterSorting() {
		int[] a = { 20, 40, 10, 50, 30 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Largest number ofter sorting");
		System.out.println(a[a.length - 1]);
		System.out.println("=====================================================");

	}

	public static void arrSearch() {
		int[] a = { 20, 40, 10, 50, 30 };
		int search = 10;
		System.out.println("Array Search");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("index  :" + i);
			}
		}
		System.out.println("==============================================================");

	}

	public static void arraySearch() {
		int[] a = { 20, 40, 10, 50, 30 };
		int search = 10;
		boolean falg = false;
		System.out.println("Array Search");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("index :" + i);
				falg = true;
				break;
			}
		}
		if (falg = false) {
			System.out.println("Element is not present");
		}
		System.out.println("==================================================================");

	}

	public static void matrixMultiplication(int[][] a, int[][] b) {
		System.out.println("matrix multiplication");

		int c[][] = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = 0;

				for (int k = 0; k < c.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("==============================================================");

	}

	public static void triplet() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] == a[k]) {
						count++;
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}

		}
		System.out.println("Total number of triplet: " + count);
		System.out.println("=======================================================");

	}

	public static void merge() {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 5, 6, 7, 8, 9 };
		int n = a.length;
		int m = a.length;
		int c[] = new int[n + m];
		System.out.println("merge two array");
		// {0,0,0,0,0,0,0,0,0}
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		// {1,2,3,4,5}
		for (int j = 0; j < b.length; j++) {
			c[j + n] = b[j];
		}
		// {1,2,3,4,5,6,7,8,9}
		for (int k = 0; k < c.length; k++) {

			System.out.print(c[k] + " ");

		}
		System.out.println();
		System.out.println("===============================================");
	}

	public static void roateToRight() {
		int a[] = { 1, 2, 3, 4, 5 };
		int n = 1;
		System.out.println("rotate to right");
		for (int i = 0; i < n; i++) {
			int last = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("==================================================");

	}

	public static void additionOfDigonal(int a[][]) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					sum = sum + a[i][j];

				}
				if (i + j == 2) {
					sum1 = sum1 + a[i][j];

				}
			}

		}
		System.out.println("the sum of right digonal :" + sum);
		System.out.println("the sum of left digonal :" + sum1);
	}
}
