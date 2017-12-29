package org.yuexinshuxuan.ws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.yuexinshuxuan.ws.entity.ShoppingCart;

@Service
public interface ShoppingCartService {

	public List<ShoppingCart> getShoppingCartById(Integer shoppingCartId);

	public int addToCart(Integer shoppingCartId, Integer bookId);

	public int updateItemStatus(Integer shoppingCartId, Integer bookId, String status);

	public int removeItem(Integer shoppingCartId, Integer bookId);
	
}
