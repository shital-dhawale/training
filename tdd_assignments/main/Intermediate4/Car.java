package com.yash.tdd.Intermediate4;

public class Car {
	private int speed;
	private String car_owner;
	private String car_type;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCar_owner() {
		return car_owner;
	}
	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public Car(int speed, String car_owner, String car_type) {
		super();
		this.speed = speed;
		this.car_owner = car_owner;
		this.car_type = car_type;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", car_owner=" + car_owner + ", car_type=" + car_type + "]";
	}
	
	

}
