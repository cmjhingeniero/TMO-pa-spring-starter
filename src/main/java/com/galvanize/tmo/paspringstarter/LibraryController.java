package com.galvanize.tmo.paspringstarter;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.tmo.paspringstarter.models.Book;
import com.galvanize.tmo.paspringstarter.service.BookService;

@RestController
public class LibraryController {

	private BookService service;

	public LibraryController(BookService service) {
		this.service = service;
	}
	
    @GetMapping("/health")
    public void health() {

    }
    
    @PostMapping("/api/books")
    public Book addBooks(@RequestBody Book book) {
    	return service.addBook(book);
    }

    @GetMapping("/api/books") 
    public List<Book> getBooks() {
    	return service.getBooks();
    }
    
    @DeleteMapping("/api/books")
    public ResponseEntity<Long> deleteBooks() {
    	service.deleteBooks();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
       
}
