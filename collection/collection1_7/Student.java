package com.collection1_7;
//int rollno;
//String sname, classname;
//String totalmarks; // marks out of 500, total five subjects each subject marks 100. 
public class Student {
	private int rollno;
    private String sname;
    private String classname;
    private int totalmarks;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    public int getTotalmarks() {
        return totalmarks;
    }
    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }
    public Student(int rollno, String sname, String classname, int totalmarks) {
        super();
        this.rollno = rollno;
        this.sname = sname;
        this.classname = classname;
        this.totalmarks = totalmarks;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
                + totalmarks + "]";
    }

	
}
