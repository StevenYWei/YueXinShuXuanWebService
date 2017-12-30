package org.yuexinshuxuan.ws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.yuexinshuxuan.ws.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addBook(Book book) {
		em.persist(book);
		return 1;
	}

	@Override
	@Transactional
	public int removeBook(String bookName) {
		Query query = em.createQuery("delete from Book b where b.bookName = :bookName");
		return query.setParameter("bookName", bookName).executeUpdate();
	}

	@Override
	@Transactional
	public int removeBook(Integer bookId) {
		Book bookToRemove = em.find(Book.class, bookId);
		em.remove(bookToRemove);
		return 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Book> getBook(String bookName) {
		Query query = em.createQuery("select b from Book b where b.bookName = :bookName");
		return query.setParameter("bookName", bookName).getResultList();
	}

	@Override
	@Transactional
	public Book getBook(Integer bookId) {
		return em.find(Book.class, bookId);
	}

	@Override
	@Transactional
	public int updateBookPrice(Integer bookId, Double newPrice) {
		Book bookToUpdate = em.find(Book.class, bookId);
		bookToUpdate.setPrice(newPrice);
		em.merge(bookToUpdate);
		return 1;
	}

	@Override
	@Transactional
	public int updateBookAuthor(Integer bookId, String newAuthor) {
		Book bookToUpdate = em.find(Book.class, bookId);
		bookToUpdate.setAuthor(newAuthor);
		em.merge(bookToUpdate);
		return 1;
	}

}
