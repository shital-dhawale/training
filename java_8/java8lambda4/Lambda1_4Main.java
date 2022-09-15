package com.java8lambda4;
//4. WAP to insert one string into another string. Also perform garbage 
//collection when insertion is done.
public class Lambda1_4Main {
	public static void main(String[] args) {
		InsertStringToAnotherString resultString = (str1,str2,index)->{
				String result = "";
				for(int i=0; i<str1.length(); i++) {
					result = result + str1.charAt(i);
					if(i==index) {
						result = result + str2;
					}
					
				}
				return result;
		};
		System.out.println("After inserting first string to second string, result string : " +resultString.getInsertedString("ShitalDhawale", "Dattatray", 5));
	}
}
