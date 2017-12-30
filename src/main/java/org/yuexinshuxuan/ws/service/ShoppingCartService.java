package org.yuexinshuxuan.ws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.yuexinshuxuan.ws.entity.ShoppingCart;

@Service
public interface ShoppingCartService {

	public ShoppingCart getShoppingCartById(Integer shoppingCartId);

	public int addToCart(ShoppingCart shoppingCart);

	public int updateItemStatus(Integer shoppingCartId, String status);

	public int removeItemById(Integer shoppingCartId);

	public int removeByUserId(Integer userId);

	public List<ShoppingCart> getShopingCartByUserId(Integer userId);

}
