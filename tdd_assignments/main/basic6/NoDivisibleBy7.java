package com.yash.tdd.basic6;

public class NoDivisibleBy7 {
	public long add()
	{
		int sum=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		NoDivisibleBy7 nd=new NoDivisibleBy7();
		
		long n=nd.add();
		System.out.println(n);
	}
}
