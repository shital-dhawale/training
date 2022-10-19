package com.yash.tdd.Intermediate4;

public class CarShop {
  private Car car;
  private boolean is_sold;
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public boolean isIs_sold() {
	return is_sold;
}
public void setIs_sold(boolean is_sold) {
	this.is_sold = is_sold;
}
public CarShop(Car car, boolean is_sold) {
	super();
	this.car = car;
	this.is_sold = is_sold;
}
@Override
public String toString() {
	return "CarShop [car=" + car + ", is_sold=" + is_sold + "]";
}
  
  
}
