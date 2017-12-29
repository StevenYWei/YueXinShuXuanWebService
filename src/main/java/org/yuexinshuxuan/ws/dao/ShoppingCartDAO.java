package org.yuexinshuxuan.ws.dao;

import java.util.List;

import org.yuexinshuxuan.ws.entity.ShoppingCart;

public interface ShoppingCartDAO {

	public List<ShoppingCart> getShoppingCartById(Integer shoppingCartId);
	
	public int addToCart(Integer shoppingCartId, Integer bookId);
	
	public int updateItemStatus(Integer shoppingCartId, Integer bookId, String status);
	
	public int removeItem(Integer shoppingCartId, Integer bookId);
	
}
