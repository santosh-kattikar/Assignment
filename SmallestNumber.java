package com.tyss.javabasics.array;

public class SmallestNumber {
	public static void main(String[] args) {
		int arr[] = { 5, 3, 8, 1, 2, 9, 4, 0 };

		int i = 0;
		int min = arr[0];
		

		for (i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println(" Smalest number is  " + min);
	}

}

//pijjghngtjugnh
