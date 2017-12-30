package org.yuexinshuxuan.ws.service;

import java.util.List;

import org.yuexinshuxuan.ws.entity.Book;

public interface BookService {

public int addBook(Book book);
	
	public int removeBook(String bookName);
	
	public int removeBook(Integer bookId);
	
	public List<Book> getBook(String bookName);
	
	public Book getBook(Integer bookId);
	
	public int updateBookPrice(Integer bookId, Double newPrice);
	
	public int updateBookAuthor(Integer bookId, String newAuthor);
	
}
