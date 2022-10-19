package com.yash.tdd.Intermediate6;

public class Book {
   private String Book_Name;
   private double Book_Price;
   private String Book_Type;
public String getBook_Name() {
	return Book_Name;
}
public void setBook_Name(String book_Name) {
	Book_Name = book_Name;
}
public double getBook_Price() {
	return Book_Price;
}
public void setBook_Price(double book_Price) {
	Book_Price = book_Price;
}
public String getBook_Type() {
	return Book_Type;
}
public void setBook_Type(String book_Type) {
	Book_Type = book_Type;
}
public Book(String book_Name, double book_Price, String book_Type) {
	super();
	Book_Name = book_Name;
	Book_Price = book_Price;
	Book_Type = book_Type;
}
@Override
public String toString() {
	return "Book [Book_Name=" + Book_Name + ", Book_Price=" + Book_Price + ", Book_Type=" + Book_Type + "]";
}
   
   
}
