package org.yuexinshuxuan.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuexinshuxuan.ws.dao.BookDAO;
import org.yuexinshuxuan.ws.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDAO;
	
	public BookServiceImpl() {}

	@Override
	public int addBook(Book book) {
		bookDAO.addBook(book);
		return 1;
	}

	@Override
	public int removeBook(String bookName) {
		bookDAO.removeBook(bookName);
		return 1;
	}

	@Override
	public int removeBook(Integer bookId) {
		bookDAO.removeBook(bookId);
		return 1;
	}

	@Override
	public List<Book> getBook(String bookName) {
		return bookDAO.getBook(bookName);
	}

	@Override
	public Book getBook(Integer bookId) {
		return bookDAO.getBook(bookId);
	}

	@Override
	public int updateBookPrice(Integer bookId, Double newPrice) {
		bookDAO.updateBookPrice(bookId, newPrice);
		return 1;
	}

	@Override
	public int updateBookAuthor(Integer bookId, String newAuthor) {
		bookDAO.updateBookAuthor(bookId, newAuthor);
		return 1;
	}

}
