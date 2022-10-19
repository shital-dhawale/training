package com.yash.tdd.Intermediate6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public int bookcount(String authorname)
	{
		Book b=new Book("c language",200.50,"Educational");
		Book b1=new Book("c++ language",201.50,"Educational");
		Book b2=new Book("java language",201.50,"Educational");
		Book b3=new Book("java1 language",201.50,"Educational");
		
		Author a1=new Author(b,"balaguruswamy");
		Author a2=new Author(b1,"balaguruswamy");
		Author a3=new Author(b2,"balaguruswamy");
		Author a4=new Author(b3,"kanetkar");
		
		List<Author>  list=new ArrayList<Author>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		//list.stream().collect(grouping(Author::getAuthor_Name).counting());
		
		int count=0;
		
		for(Author at:list)
		{
		
			if(authorname.equals(at.getAuthor_Name()))
			{
				count++;
			}
		}
		
		return count;
		
	}		
	
		
		
/*		
		
  long count1= list.stream().filter(x->x.getAuthor_Name().equals(b))l;
		
		
		int count=0;
		
		  if(a1.getAuthor_Name()==a2.getAuthor_Name()) 
				  {
			  
			  
			  count++; 
			  
			
			  
			  if(a1.getAuthor_Name()==a3.getAuthor_Name())
					  {
			  count++;
			
			  
			  
			  if(a2.getAuthor_Name()==a3.getAuthor_Name())
			  {
				count++;
				
				
			  }
			  }
				  }  
		  System.out.println("books written by same author "+count);  
				  
				  return count;
				  	
	}
	*/
	
public static void main(String[] args) {
	
	Test1 t=new Test1();
	int count1=t.bookcount("balaguruswamy");
	System.out.println(count1);
			  	 
	  
	 
	
}
}
	
