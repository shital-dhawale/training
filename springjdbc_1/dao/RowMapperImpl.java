package com.springjdbc_1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc_1.entities.Student;



public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setId(rs.getInt(1));//column name-1
		student.setName(rs.getString(2));//column name-2
		
		return student;
	}

}
