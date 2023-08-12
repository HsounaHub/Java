package com.ali.booksApi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ali.booksApi.models.Book;
import com.ali.booksApi.services.BookService;

@Controller
public class BookController {
	private final BookService bookServ;
	public BookController(BookService bookServ) {
		this.bookServ = bookServ;
	}
	

	@RequestMapping("/books")
	public String index(Model model) {
		

		List<Book> allDaBooks = bookServ.allBooks();

		model.addAttribute("bookList",allDaBooks);
		return "books.jsp";
			
	}

	@RequestMapping("/books/new")
	public String bookForm() {
		
		return "create.jsp";
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public String create (@RequestParam("title") String title,
						@RequestParam("description") String desc,
						@RequestParam("language") String lang,
						@RequestParam("numberOfPages") int pages) {
		
		Book submittedBook = new Book(title, desc, lang, pages);
		
		Book newlyCreatedbook = bookServ.createBook(submittedBook);
		
		return "redirect:/books";
		
		
}
	
	@RequestMapping("/books/{id}")
	public String showOne(@PathVariable("id") Long id,
					Model model) {
		
		Book thisBook = bookServ.findBook(id);
		
		model.addAttribute("book",thisBook);
		
		return "show.jsp";
	}
}
