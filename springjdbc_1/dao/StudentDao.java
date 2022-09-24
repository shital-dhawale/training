package com.springjdbc_1.dao;

import java.util.List;

import com.springjdbc_1.entities.Student;



public interface StudentDao {
	public int insert(Student stu);
	public int updatedetails(Student stu);
	public int deletedetails(int stuid);
	public Student selectDetails(int stuid);
	public List<Student> getAllDetails();
	
}
