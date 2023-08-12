package com.ali.booksApi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ali.booksApi.models.Book;

public interface BookeRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
