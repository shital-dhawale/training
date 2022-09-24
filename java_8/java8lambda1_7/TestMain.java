package com.java8lambda1_7;

public class TestMain {
	public static void main(String[] args) {

		ResultCalculation r = new ResultCalculation();
	        Calculate cal;
	        double d = 0;
	        cal = r.emiCalculation();
	       d = r.input(cal, 1200, 10, 12, 1);
	       System.out.println(d);
}
}
