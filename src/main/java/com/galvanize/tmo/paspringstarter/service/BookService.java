package com.galvanize.tmo.paspringstarter.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.galvanize.tmo.paspringstarter.models.Book;
import com.galvanize.tmo.paspringstarter.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
	
	public Book addBook(Book book) {
    	return bookRepository.save(book);
    }
	
	public List<Book> getBooks() {
		return bookRepository.findAll(Sort.by(Sort.Direction.ASC, "title"));
	}
	
	public void deleteBooks() {
		bookRepository.deleteAll();
	}
	
}
