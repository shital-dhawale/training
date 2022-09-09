package com.collection1_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Suppose that you are given the In-Order traversal of the Binary Search Tree in the 
//form of ArrayList or Array. Now your task is that you have create a new ArrayList or 
//Array for the In-Order traversal of Binary Search Tree where all duplicates are 
//removed.
public class Collection1_10 {
	public static void main(String[] args) {
		List<Integer> inOrderBinarySearchTree = new ArrayList<Integer>();
		inOrderBinarySearchTree.add(4);
		inOrderBinarySearchTree.add(4);
		inOrderBinarySearchTree.add(2);
		inOrderBinarySearchTree.add(2);
		inOrderBinarySearchTree.add(5);
		inOrderBinarySearchTree.add(1);
		inOrderBinarySearchTree.add(3);
		
		List<Integer> list1 = inOrderBinarySearchTree.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
	}

}
