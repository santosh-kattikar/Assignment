package com.tyss.javabsics.comparatotandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		boolean count = true;
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(123, 23, 70.76, "Santosh", "Belgavi"));
		arrayList.add(new Student(156, 22, 73.76, "Manjunath", "Ballari"));
		arrayList.add(new Student(256, 25, 78.76, "Karthik", "Mysore"));
		arrayList.add(new Student(658, 24, 80.76, "Suhasini ", "Bengalore"));
		arrayList.add(new Student(589, 20, 71.76, "Ankit", "Mumbai"));
		// Collections.sort(arrayList, new CompareByRollNumber());

		do {

			System.out.println("Enter 1 to sort by roll number ");
			System.out.println("Enter 2 to sort by student name ");
			System.out.println("Enter 3 to sort by student adress ");
			System.out.println("Enter 4 to sort by student age ");
			System.out.println("Enter 5 to sort by student marks ");
		

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Number");
			int number = scanner.nextInt();

			switch (number) {
			case 1: {
				Collections.sort(arrayList, new CompareByRollNumber());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 2: {
				Collections.sort(arrayList, new CompareByStudentName());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 3: {
				Collections.sort(arrayList, new CompareByStudentAdress());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 4: {
				Collections.sort(arrayList, new CmpareByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			case 5: {
				Collections.sort(arrayList, new CompareByStudentMarks());
				for (Student student : arrayList) {
					System.out.println(student);
				}

			}
				break;
			}
			
			
				System.out.println("want further student details output by different sorting methods?");
				String string = scanner.next();
				if (string.equalsIgnoreCase("YES")) {
					count = true;
				} else if (string.equalsIgnoreCase("NO")) {
					count = false;
					//System.out.println("Exit");
					

					
				}
		}while (count);
		System.exit(0);
	}
		
	}
			
			
	

			
		
		
		
