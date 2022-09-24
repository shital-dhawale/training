package com.springjdbc_1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc_1.dao.StudentDao;
import com.springjdbc_1.entities.Student;




/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc_1/applicationcontext.xml");
		StudentDao stdao=context.getBean("StudentDao",StudentDao.class);
	
		Student s=new Student(); 
		//s.setId(107);
		//s.setName("Shital Dhawale");
		//int r=stdao.insert(s);//insert the details
		///int r=stdao.updatedetails(s);//update the details
		//System.out.println(r + "Student added Successfully ");
		//System.out.println(r + "Student details updated ");
		int r=stdao.deletedetails(107);//delete the details
		//Student s=stdao.selectDetails(108);
		//System.out.println(s);
		List<Student> stu=stdao.getAllDetails();
		for(Student st:stu)
		{
			System.out.println(s);
		}
    }
}
