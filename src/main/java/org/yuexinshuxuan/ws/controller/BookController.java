package org.yuexinshuxuan.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.entity.Book;
import org.yuexinshuxuan.ws.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	BookService bookService;

	public BookController() {
	}

	@GetMapping("/getBook/bookId/{bookId}")
	public Book getBookById(@PathVariable Integer bookId) {
		return bookService.getBook(bookId);
	}

	@GetMapping("/getBook/name/{bookName}")
	public List<Book> getBookByBookname(@PathVariable String bookName) {
		return bookService.getBook(bookName);
	}

	@PostMapping("/addBook")
	public int addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return 1;
	}

	@GetMapping("/removeBook/name/{bookName}")
	public int removeBook(@PathVariable String bookName) {
		bookService.removeBook(bookName);
		return 1;
	}

	@GetMapping("/removeBook/bookId/{bookId}")
	public int removeBook(@PathVariable Integer bookId) {
		bookService.removeBook(bookId);
		return 1;
	}

	@GetMapping("/updateBook/price")
	public int updateBookPrice(@RequestParam Integer bookId, @RequestParam Double newPrice) {
		bookService.updateBookPrice(bookId, newPrice);
		return 1;
	}

	@GetMapping("/updateBook/author")
	public int updateBookAuthor(@RequestParam Integer bookId, @RequestParam String newAuthor) {
		bookService.updateBookAuthor(bookId, newAuthor);
		return 1;
	}

}
