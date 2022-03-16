package com.tyss.javabsics.comparatotandcomparator;

import java.util.Comparator;

public class CompareByStudentMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o1.marks-o2.marks);
	}

}
