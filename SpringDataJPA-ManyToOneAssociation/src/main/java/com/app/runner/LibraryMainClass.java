package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.ServiceImpl.BookServiceImpl;
import com.app.ServiceImpl.StudentServiceImpl;
import com.app.entity.Book;
import com.app.entity.Student;

@Component
public class LibraryMainClass  implements CommandLineRunner{

	@Autowired
	private StudentServiceImpl studentService;
	
	@Autowired
	private BookServiceImpl bookService;
	
	@Override
	public void run(String... args) throws Exception {
	   try 
		{
		   //save book
		   
			
			  Book book1 = new Book(null,"DSA");
			  
			  Book book2 = new Book(null,"JAVA");
			  
			  String msg = bookService.saveBook(book1);
			  
			  String msg1 = bookService.saveBook(book2);
			  
			 
		   
			
		   
		   //save student
		   
		   Student student1 = new Student(null,"Yogesh",book1);
		   
		   String studentmsg = studentService.saveStudent(student1);
		   
		   System.out.println(studentmsg);
		   
		   
			
		}
		catch (Exception e) {
			
		}
	}

}
