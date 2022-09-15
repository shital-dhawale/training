package com.training;
//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.

//The dimensions of the Box are width, height, depth.

//The class should have a method that can return the volume of the box.

//Create an object of the Box class and test the functionalities.
public class Object1_1 {
	int width;
	int height;
	int depth;
	public Object1_1(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	
	}
	public double getBoxVolume(){
		double boxVolume = width*height*depth;
		return boxVolume;
	}
	public static void main(String[] args) {
		Object1_1 object = new Object1_1(1, 9, 10);
		System.out.println("Box volume is : " +object.getBoxVolume());
		
	}

}
