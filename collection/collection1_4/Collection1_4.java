package com.collection1_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//WAP to store elements in List and remove all duplicates names of items. After 
//duplicates are removed print all elements in descending order.
public class Collection1_4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("shital");
		list.add("rupesh");
		list.add("roshan");
		list.add("shital");
		list.add("roshan");
		list.add("sarala");
		list.add("devashree");
		list.add("rahul");
		List<String> list1 = list.stream().distinct().collect(Collectors.toList());
		Collections.sort(list1);
		Collections.reverse(list1);
		System.out.println(list1);
	}
}
