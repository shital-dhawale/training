package com.springjdbc_1.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc_1.entities.Student;
import com.springjdbc_1.dao.RowMapperImpl;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbctemp;
public int insert(Student stu) {
		
		String q="insert into student(id,name) values(?,?)";
    	int msg=this.jdbctemp.update(q,stu.getId(),stu.getName());
		return msg;
	}
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int updatedetails(Student stu) {
		// update details of student
		String q="update student set name=? where id=?";
		int msg=this.jdbctemp.update(q,stu.getName(),stu.getId());
		
		return msg;
	}
	
	public int deletedetails(int stuid) {
		// TODO Auto-generated method stub
		String q="delete from student where id=?";
		int msg=this.jdbctemp.update(q,stuid);
		
		return msg;
		
	}
	
	public Student selectDetails(int stuid) {
		// TODO Auto-generated method stub
		String q="select * from student where id=?";
		RowMapper<Student> rowmapper=new RowMapperImpl();
		Student student=this.jdbctemp.queryForObject(q,rowmapper,stuid);
		
		return student;
		
	}
	
	public List<Student> getAllDetails() {
		// TODO Auto-generated method stub
		String q="select * from student";
		List<Student> stu=this.jdbctemp.query(q,new RowMapperImpl());
		return stu;
		
	}

}
