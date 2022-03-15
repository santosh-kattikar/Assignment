package com.tyss.javabasics.common;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Month");
		int month = scanner.nextInt();
	
		System.out.println("Enter The Year");
		int year = scanner.nextInt();
		
		
		switch (month) {
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println(year + "is a leap year");
				System.out.println("29 days in February");
			} else {

				System.out.println(year + "is not a leap year ");
				System.out.println("28 days in February");
			}

			break;
		case 3:
			System.out.println("MARCH");
			break;
		case 4:
			System.out.println("APRIL");
			break;
		case 5:
			System.out.println("MAY");
			break;
		case 6:
			System.out.println("JUNE");
			break;
		case 7:
			System.out.println("JULY");
			break;
		case 8:
			System.out.println("AUGUST");
			break;
		case 9:
			System.out.println("SEP");
			break;
		case 10:
			System.out.println("OCTOBER");
			break;
		case 11:
			System.out.println("NOVEMBER");
			break;
		case 12:
			System.out.println("DECEMBER");
			break;

		default:
			System.out.println("invalid");

		}

	}

}
