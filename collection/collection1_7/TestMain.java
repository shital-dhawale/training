package com.collection1_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
	public static void main(String[] args) {

		List<Student> l = new ArrayList<Student>();

		l.add(new Student(101, "Shital", "java", 200));
		l.add(new Student(102, "Nishigandha", "C", 300));
		l.add(new Student(103, "Kajal", "C++", 350));
		l.add(new Student(104, "Minakshi", "Python", 320));
		l.add(new Student(105, "Pooja", "AWS", 150));

		for (Student student : l) {

			int avg = student.getTotalmarks() * 100 / 500;

			if (avg < 50) {
				System.out.println("Students below 50% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg < 35) {
				System.out.println("Students below 35% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg > 60) {
				System.out.println("Students above 60% :" + avg);
				System.out.println(student.getSname());
			}
		}

		execute(l);
	}

	private static void execute(List<Student> stu) {

		Collections.sort(stu, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String sname1 = o1.getSname();
				String sname2 = o2.getSname();

				return sname2.compareTo(sname1);
			}
		});
		System.out.println(stu);
	}
}
