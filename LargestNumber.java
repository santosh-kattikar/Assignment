package com.tyss.javabasics.array;

public class LargestNumber {
	public static void main(String[] args) {

		int[] arr1 = { 50, 2, 3, 30, 5, 6, 15, 20 };

//		  Array.sort( arr1 );
//		  System.out.println("First largest number in an array is  = "+arr1[arr1.length-1]);
//		  System.out.println("Second largest number in an array is  = "+
//		  arr1[arr1.length-2]);

		int maxNumber = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > maxNumber) {
				maxNumber = arr1[i];
			}
		}
		System.out.println("The largest number is  " + maxNumber);

	}

}
