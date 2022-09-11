package com.collection1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//WAP to store all Collection elements in Array and perform the Binary Search
public class Collection1_2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(10);
		list.add(5);
		int index = Collections.binarySearch(list, 7);
		System.out.println(index);
	}
}
