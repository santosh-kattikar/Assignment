package com.tyss.javabasics.array;

public class DuplicateElement {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 12, 4, 89, 5, 7 };

		int c1 = 0, c2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && (i != j)) {
					System.out.println(" Duplicate number is " + arr[j]);
					c2++;
				} else {
					c1++;
				}
			}
		}
		if (c1 > 0 && c2 == 0) {
			System.out.println("No Duplicates");
		}
	}
//	int[] arr1 = { 1, 2, 2, 12, 4, 89, 5, 7 };
//	
//	for(int j = 0; j < arr1.length; i++) {
//		int count = 0;
//		if (a[i] == a[j] && i != j) {
//			count++;
//			a[i] = '\n';
//			
//		}
//	}
//	if (a[j] != '\n' && count > 0) {
//		System.out.println(a[j]+" ");
//	}

	

}
