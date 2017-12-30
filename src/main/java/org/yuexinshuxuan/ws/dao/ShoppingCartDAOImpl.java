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
	public List<ShoppingCart> getShopingCartByUserId(Integer userId) {
		Query query = em.createQuery("select sc from ShoppingCart sc where sc.userId = :userId");
		return query.setParameter("userId", userId).getResultList();
	}

	@Override
	@Transactional
	public int addToCart(ShoppingCart shoppingCart) {
		em.persist(shoppingCart);
		return 1;
	}

	@Override
	@Transactional
	public int updateItemStatus(Integer shoppingCartId, String status) {
		Query query = em.createQuery("select sc from ShoppingCart sc where sc.shoppingCartId = :shoppingCartId");
		ShoppingCart shoppingCart = (ShoppingCart) query.setParameter("shoppingCartId", shoppingCartId)
				.getSingleResult();
		shoppingCart.setSttsCode(status);
		em.merge(shoppingCart);
		return 1;
	}

	@Override
	@Transactional
	public int removeItemById(Integer shoppingCartId) {
		ShoppingCart shoppingCart = em.find(ShoppingCart.class, shoppingCartId);
		em.remove(shoppingCart);
		return 1;
	}

	@Override
	@Transactional
	public ShoppingCart getShoppingCartById(Integer shoppingCartId) {
		return em.find(ShoppingCart.class, shoppingCartId);
	}

	@Override
	@Transactional
	public int removeByUserId(Integer userId) {
		Query query = em.createQuery("delete from ShoppingCart sc where sc.userId = :userId");
		query.setParameter("userId", userId).executeUpdate();
		return 1;
	}

}
