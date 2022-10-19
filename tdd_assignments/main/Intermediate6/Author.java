package com.yash.tdd.Intermediate6;

public class Author {
private Book book;
private String Author_Name;
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public String getAuthor_Name() {
	return Author_Name;
}
public void setAuthor_Name(String author_Name) {
	Author_Name = author_Name;
}
public Author(Book book, String author_Name) {
	super();
	this.book = book;
	Author_Name = author_Name;
}
@Override
public String toString() {
	return "Author [book=" + book + ", Author_Name=" + Author_Name + "]";
}




}
