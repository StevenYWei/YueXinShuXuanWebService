package org.yuexinshuxuan.ws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.yuexinshuxuan.ws.entity.ShoppingCart;

@Repository
public class ShoppingCartDAOImpl implements ShoppingCartDAO {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ShoppingCart> getShoppingCartById(Integer shoppingCartId) {
		Query query = em.createQuery("select sc from ShoppingCart sc where sc.shoppingCartId = :shoppingCartId");
		return query.setParameter("shoppingCartId", shoppingCartId).getResultList();
	}

	@Override
	@Transactional
	public int addToCart(Integer shoppingCartId, Integer bookId) {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setShoppingCartId(shoppingCartId);
		shoppingCart.setBookId(bookId);
		shoppingCart.setSttsCode("ACTIVE");
		em.persist(shoppingCart);
		return 1;
	}

	@Override
	@Transactional
	public int updateItemStatus(Integer shoppingCartId, Integer bookId, String status) {
		Query query = em.createQuery("select sc from ShoppingCart sc where sc.shoppingCartId = :shoppingCartId and sc.bookId = :bookId");
		ShoppingCart shoppingCart = (ShoppingCart) query.setParameter("shoppingCartId", shoppingCartId).setParameter("bookId", bookId).getSingleResult();
		shoppingCart.setSttsCode(status);
		em.merge(shoppingCart);
		return 1;
	}

	@Override
	@Transactional
	public int removeItem(Integer shoppingCartId, Integer bookId) {
		Query query = em.createQuery("delete from ShoppingCart sc where sc.shoppingCartId = :shoppingCartId and sc.bookId = :bookId");
		query.setParameter("shoppingCartId", shoppingCartId).setParameter("bookId", bookId).executeUpdate();
		return 1;
	}

}
