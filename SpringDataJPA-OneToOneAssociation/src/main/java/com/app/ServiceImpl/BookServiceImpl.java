package com.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.repo.BookRepository;
import com.app.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookRepository bookrepo;
	
	@Override
	public String saveBook(Book book) {
		 
		Book book1 = bookrepo.save(book);
		return "Book Save with book id"+book1.getBid();
	}

}
