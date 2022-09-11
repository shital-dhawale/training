package com.training;
//7.	WAP to demonstrate how garbage collector work when any 
//memory is not referenced by string object.
public class String1_7 {
	String str;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected");
	}
	public static void main(String[] args) {
		String1_7 str1 = new String1_7();
		str1 = null;
		System.gc();
	}
	
}
