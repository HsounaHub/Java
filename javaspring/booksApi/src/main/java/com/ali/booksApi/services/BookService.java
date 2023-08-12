package com.ali.booksApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ali.booksApi.models.Book;
import com.ali.booksApi.repositories.BookeRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookeRepository bookRepository;
    
    public BookService(BookeRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book updatedBook = new Book();
		updatedBook.setId(id);
		updatedBook.setTitle(title);
		updatedBook.setDescription(desc);
		updatedBook.setLanguage(lang);
		updatedBook.setNumberOfPages(numOfPages);
		bookRepository.save(updatedBook);
		return null;
	}
}
