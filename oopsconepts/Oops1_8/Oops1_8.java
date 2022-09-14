package com.oops1_8;
//8.	With the help of finalize method print the how many objects are currently a 
//class is having and which object is going to be freed from the memory with its 
//hashcode. 
public class Oops1_8 {
	 public static void main(String[] args)   
	    {   
		 Oops1_8 obj = new Oops1_8();   
	        System.out.println("Hashcode of object= "+obj.hashCode());   
	        obj = null;   
	        // calling garbage collector    
	        System.gc();   
	        System.out.println("end of garbage collection");   
	  
	    }   
	    protected void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
}
