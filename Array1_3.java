package com.training;
//3.	WAP to create a dynamic array. Dynamic Array means when user want to input 
//the number more than size of array it will increase the size of array 
//without throwing exception
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array1_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        String myArray[] = new String[size];
        System.out.println("Enter elements of the array (Strings) :: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.next();
        }
        System.out.println(Arrays.toString(myArray));
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
        System.out.println("Enter the element that is to be added:");
        String element = sc.next();
        myList.add(element);
        myArray = myList.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
        
     }
}
