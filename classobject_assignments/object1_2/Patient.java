package com.object1_2;
//Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.

//Name of the class - Patient

//Member Variables - patientName(String),height(double),weight(double)

//Member Function - double computeBMI()

//The above method should compute the BMI and return the result. The formula for 
//computation of BMI  is weight (in kg) ÷ height*height(in metres).

//Create an object of the Patient class and check the results.
public class Patient {
	String patientName;
	double height;
	double weight;
	
	public static double computeBMI(String patientName,double height,double weight) {
		System.out.println("Patient name is : " +patientName);
		double computedBMI = weight/(height*height);
		return computedBMI;
	}
	public static void main(String args[]) {
		Patient patient = new Patient();
		double computedBMI =patient.computeBMI("shital", 5, 40);
		System.out.println("Calculated BMI is : " +computedBMI);
}
}
