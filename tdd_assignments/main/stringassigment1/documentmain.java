package com.yash.tdd.stringassigment1;

public class documentmain {
	private String title;
	private String filepath;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	public String showDocumentInformation() {
		
		setTitle("java basics");
		
		setFilepath("c:/document/corejava/basics/introduction.pdf");
		//System.out.println(this.getTitle()+" , "+this.getFilepath());
		return "{title:"+this.getTitle()+","+"filepath:"+this.getFilepath()+"}";
	}
	
	
	@Override
	public String toString() {
		return "Document [title=" + title + ", filepath=" + filepath + "]";
	}
	
	


}
