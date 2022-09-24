package com.java8lambda1_10;

import java.util.HashMap;
import java.util.Scanner;

public class Lambda1_10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap< Integer, Double> hmap = new HashMap<>();
        Integer year = null;
        Double sell = null;
        System.out.println("Enter year and sell in crore");
        for(int i=1;i<6;i++)
        {
            System.out.println("Enter year:");
             year = sc.nextInt();
            System.out.println("Enter sell:");
            sell = sc.nextDouble();
            hmap.put(year, sell);
        }
        
        hmap.put((year+1), (sell+0.5));
        hmap.put((year+2), (sell+1));
        hmap.put((year+3), (sell+1.5));
        
        System.out.println("Your data: " +hmap);
        System.out.println("Enter year for predication of sell for any given year:");
        int input=sc.nextInt();
        hmap.forEach((k,v)->System.out.println("Year is:"+k +" sell is:"+v));
        
        System.out.println(hmap.get(input));
        
}
}
