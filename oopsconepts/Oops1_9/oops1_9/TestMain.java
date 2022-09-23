package com.oops1_9;

@SuppressWarnings("serial")
public class TestMain extends CloneNotSupportedException
{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		Product product1=new Product(111, "Oreo", 10, "Gram");
		        
		        Product product2=(Product) product1.clone();
		        product2.setPname("JimJam");
		        product2.setPrice(34353);
		        
		        System.out.println(product2);
		        if(product2 instanceof Product) {
		            
		            System.out.println("Objects are same");
		        }
			        
			    
				
			
			}
}
