package com.collection1_5;

import java.util.Collections;
import java.util.Vector;

//WAP to store data related to item in Vector and after that sort the data.
public class Collection1_5 {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("shital");
		vector.add("rupesh");
		vector.add("roshan");
		vector.add("shital");
		vector.add("roshan");
		vector.add("devashree");
		Collections.sort(vector);
		System.out.println(vector);
		
	}
}
