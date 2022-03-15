package com.tyss.javabasics.array;

public class SecondLargestNumber {
	public static void main(String[] args) {

		int largest = 0;
		int secondLargest = 0;

		int[] arr = { 380, 23, 565, 56, 86, 250, 350 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}

		}
		System.out.println("The second largest number is  " + secondLargest);

	}

}
