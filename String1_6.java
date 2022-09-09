package com.training;

public class String1_6 {
	public static void main(String args[]) {
        // These strings are created in the String Pool
        String str1 = "Java";
        String str2 = "C++";



       // JVM returns the reference of the pooled instance, i.e., str1
        // str3 will not be created in the string pool
        String str3 = "Java";



       // stored in Java heap memory outside the String Pool
        String str4 = new String("Java");
        String str5 = new String("C++");



       // str6 it will not get stored in the Java heap
        // it will hold reference of the already-existing String object with the value "Java"
        // in the String Constant Pool
        String str6 = new String("Java").intern();



       // false
        System.out.println(str1 == str4);



       // false
        //str2 occupies space in the string pool, and str7 occupies space in the Java heap
        System.out.println(str2 == str5);



       // true
        // address of both strings are the same
        System.out.println(str1 == str3);



       // true
        // address of both strings are the same
        System.out.println(str1 == str6);
      }
}
