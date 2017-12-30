package org.yuexinshuxuan.ws.dao;

import java.util.List;

import org.yuexinshuxuan.ws.entity.Book;

public interface BookDAO {

	public int addBook(Book book);
	
	public int removeBook(String bookName);
	
	public int removeBook(Integer bookid);
	
	public List<Book> getBook(String bookName);
	
	public Book getBook(Integer bookid);
	
	public int updateBookPrice(Integer bookId, Double newPrice);
	
	public int updateBookAuthor(Integer bookId, String newAuthor);
	
}
