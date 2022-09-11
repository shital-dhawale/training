package com.collection1_6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//WAP to store data in hashmap. Keys are the city name and values 
//are the population. Now you have to sort the all elements 
//(on the basis of city name ) in hashmap and print the detail.
public class Collection1_6 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("chikhli", 147896);
		map.put("kopargaon", 303589);
		map.put("chinchwad", 1727692);
		map.put("buldana", 2767419);
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		System.out.println("After sorting according to key : ");
		for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println("Key : " +entry.getKey()+ " and Value : " +entry.getValue());
			
		}
		
	}
}
