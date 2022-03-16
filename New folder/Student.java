package com.tyss.javabsics.comparatotandcomparator;

import java.util.Comparator;

public class Student {
	int rollNumber, age;
	double marks;
	String Name, adress;

	public Student(int rollNumber, int age, double marks, String name, String adress) {

		this.rollNumber = rollNumber;
		this.age = age;
		this.marks = marks;
		Name = name;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", marks=" + marks + ", Name=" + Name
				+ ", adress=" + adress + "]";
	}
	
	

}
