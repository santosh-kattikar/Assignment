package com.tyss.javabasics.array;

public class SecondSmallest {
	public static void main(String[] args) {

		int arr[] = { 55, 43, 18, 11, 12, 19, 14, 10 };

		int i = 0;
		int secSmallest = arr[0];

		for (i = 1; i < arr.length - 1; i++) {

			if (arr[i] < secSmallest) {
				secSmallest = arr[i];
			}

		}
		System.out.println("Second smallest number is  " + secSmallest);
	}

}
