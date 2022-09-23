package com.oops1_9;
//9.	WAP to demonstrate the use of clone method. Clone one object of Product class :- 
//pid, pname, price and unitOfMeasurement. When you clone object of class Product  
//change the product name and price.  With the help of instanceOf check that the newly 
//created object is belong to Product class or not.
public class Product {
	int pid;
	String pname;
	double price; 
	String unitOfMeasurement;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, double price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	   public Object clone()throws CloneNotSupportedException{  
	        return super.clone();  
	        }
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}
	
	
	
	
}
