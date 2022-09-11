package com.collection1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// WAP to sort Collection elements in ascending order.

public class Collection1_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("shital");
		list.add("rupesh");
		list.add("roshan");
		list.add("devashree");
		list.add("sarala");
		Collections.sort(list);
		System.out.println("Sorted in ascending order : " +list);
	}
}
