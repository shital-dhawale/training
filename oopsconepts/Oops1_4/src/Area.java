import java.util.Scanner;

//Create a class Area in which user will be asked to input the sides of shape. 
//User will be asked to input three sides of shape. 
//If user input two sides of shape same, you have to print area of square 
//for that side. With 3 inputs you have to print area of rectangle in combination. 
//With 3 sides you have to print the area of triangle. Also check the given 
//three sides are belong to right angle triangle or not. 

public class Area {
	public static void getArea(int side) {
		double area = side*side;
		System.out.println("Area of Square : " +area);
	}
	public static void getArea(int side, int side1) {
		double squareArea = side*side;
		double rectangleArea = side*side1;
		System.out.println("Area of Square : " +squareArea);
		System.out.println("Area of Rectangle : " +rectangleArea);
	}
	public static void getArea(int side1, int side2, int side3) {
		double semiPerimeterOfTriangle = (side1+side2+side3)/2;
		double triangleAreaSquare = (semiPerimeterOfTriangle*(semiPerimeterOfTriangle-side1)*(semiPerimeterOfTriangle-side2)*(semiPerimeterOfTriangle-side3));
		double triangleArea = Math.sqrt(triangleAreaSquare);
		System.out.println("Area of Triangle : " +triangleArea);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three side inputs for calculating area : ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		System.out.println("First side : " +input1);
		System.out.println("Second side : " +input2);
		System.out.println("Third side : " +input3);
		if((input1==input2&&input3<=0)||(input1==input3&&input2<=0)||(input2==input3&&input1<=0)) {
			if(input1==input2&&input3<=0) {
				getArea(input1);
			}else if(input1==input3&&input2<=0){
				getArea(input1);
			}else {
				getArea(input3);
			}
			
		}else if((input1==input2||input1==input3||input2==input3)&&(input1>0||input2>0||input3>0)){
			if((input1==input2)&&input3>0) {
				getArea(input1);
				getArea(input1, input3);
				
			}else if((input1==input3)&&input2>0) {
				getArea(input1);
				getArea(input1, input2);
			}else {
				getArea(input2);
				getArea(input1, input2);
			}
		}else {
			getArea(input1, input2, input3);
		}
		
	}
}
