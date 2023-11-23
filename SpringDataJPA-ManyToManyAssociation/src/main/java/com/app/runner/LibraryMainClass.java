package com.app.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			  
			   bookService.saveBook(book1);
			  
			    bookService.saveBook(book2);
			  
			 
		   
			
		   
		   //save student
			  
			Set<Book> allbook = Set.of(book1,book2);
			
			Student s1 = new Student(null,"Yogesh", allbook);
			
			Student s2 = new Student(null,"Sachin", allbook);
			
			
			studentService.saveStudent(s1);
			
			studentService.saveStudent(s2);
		   
		  
		   
		
		   
		   
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
