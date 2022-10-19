package com.yash.tdd.Intermediate4;

import java.util.ArrayList;
import java.util.List;




public class CarShopApp {
	
	
	 public int NoofCarSold()
	 {
			Car c1=new Car(80,"aaa","swift");
			Car c2=new Car(70,"bbb","alto");
			Car c3=new Car(60,"ccc","bmw");
			Car c4=new Car(90,"ddd","oddi");
			Car c5=new Car(50,"eee","ciaaz");
			Car c6=new Car(70,"fff","baleno");
			Car c7=new Car(80,"ggg","nexon");
			Car c8=new Car(90,"hhh","tiago");
			Car c9=new Car(60,"iii","brizza");
			Car c10=new Car(50,"jjj","zen");
			
			CarShop cs1=new CarShop(c1,true);
			CarShop cs2=new CarShop(c2,false);
			CarShop cs3=new CarShop(c3,true);
			CarShop cs4=new CarShop(c4,true);
			CarShop cs5=new CarShop(c5,true);
			CarShop cs6=new CarShop(c6,true);
			CarShop cs7=new CarShop(c7,true);
			CarShop cs8=new CarShop(c8,false);
			CarShop cs9=new CarShop(c9,true);
			CarShop cs10=new CarShop(c10,false);
			
			
			List<CarShop> list=new ArrayList<CarShop>();
			
			list.add(cs1); 	list.add(cs2); list.add(cs3);list.add(cs4);list.add(cs5);
			list.add(cs6);list.add(cs7);list.add(cs8);list.add(cs9);list.add(cs10);
			
		int count=0;
		
				for(CarShop cs:list)
			{  
							
			if(cs.isIs_sold()== true){
					count++;
				}
			}
			
			return count;
			
		} 
	 
    public static void main(String[] args) {
    	
    	CarShopApp csa=new CarShopApp();
    	int c=csa.NoofCarSold();
    	System.out.println(c);
	
}}
