package com.oops1_2;

public class Rectangle implements Shape{

	@Override
	public void findArea(double vertexA, double vertexB, double vertexC) {
		double areaOfRectangle = (vertexB - vertexA) * vertexC;
		
		System.out.println("Area Of Rectangle="+areaOfRectangle);
		
	}

}
