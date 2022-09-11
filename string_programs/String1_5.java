package com.training;

import javax.swing.filechooser.FileSystemView;

public class String1_5 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer("Shital");
		for(int i=0; i<10000; i++) {
			stringBuffer.append("Dhawale");
		}
		System.out.println("Time taken by String Buffer : " +(System.currentTimeMillis()-startTime) +" ms");
		startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder("Shital");
		for(int i=0; i<10000; i++) {
			stringBuilder.append("Dhawale");
		}
		System.out.println("Time taken by String Builder : " +(System.currentTimeMillis()-startTime) +" ms");
	}


}
