package com.galvanize.tmo.paspringstarter.service;

import java.util.ArrayList;
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
		List<Book> listBook = new ArrayList<Book>();
		listBook.add(new Book(2L, "Philip K. Dick", "Do Androids Dream of Electric Sheep?", 1968));
		listBook.add(new Book(3L, "William Gibson", "Neuromancer", 1984));
		listBook.add(new Book(1L, "Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 1979));
		return listBook;
		//return bookRepository.findAll(Sort.by(Sort.Direction.ASC, "title"));
	}
	
	public void deleteBooks() {
		bookRepository.deleteAll();
	}
	
}
