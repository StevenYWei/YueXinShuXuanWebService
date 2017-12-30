package org.yuexinshuxuan.ws.dao;

import java.util.List;

import org.yuexinshuxuan.ws.entity.ShoppingCart;

public interface ShoppingCartDAO {

	public ShoppingCart getShoppingCartById(Integer shoppingCartId);
	
	public int addToCart(ShoppingCart shoppingCart);
	
	public int updateItemStatus(Integer shoppingCartId, String status);
	
	public int removeItemById(Integer shoppingCartId);
	
	public int removeByUserId(Integer userId);
	
	public List<ShoppingCart> getShopingCartByUserId(Integer userId);
	
}
