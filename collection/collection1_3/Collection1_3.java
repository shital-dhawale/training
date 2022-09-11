package com.collection1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//WAP to store elements in List and remove all duplicates value from it. 
//(Numbers should be inserted). When duplicates are removed print all elements 
//in ascending order.
public class Collection1_3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(5);
		list.add(7);
		list.add(3);
		List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
		Collections.sort(list1);
		System.out.println(list1);
	}
}
