package org.yuexinshuxuan.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuexinshuxuan.ws.dao.ShoppingCartDAO;
import org.yuexinshuxuan.ws.entity.ShoppingCart;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	ShoppingCartDAO shoppingCartDAO;

	@Override
	public ShoppingCart getShoppingCartById(Integer shoppingCartId) {		
		return shoppingCartDAO.getShoppingCartById(shoppingCartId);
	}
	
	@Override
	public List<ShoppingCart> getShopingCartByUserId(Integer userId) {
		return shoppingCartDAO.getShopingCartByUserId(userId);
	}

	@Override
	public int addToCart(ShoppingCart shoppingCart) {
		shoppingCartDAO.addToCart(shoppingCart);
		return 1;
	}

	@Override
	public int updateItemStatus(Integer shoppingCartId, String status) {
		shoppingCartDAO.updateItemStatus(shoppingCartId, status);
		return 1;
	}

	@Override
	public int removeItemById(Integer shoppingCartId) {
		shoppingCartDAO.removeItemById(shoppingCartId);
		return 1;
	}

	@Override
	public int removeByUserId(Integer userId) {
		shoppingCartDAO.removeByUserId(userId);
		return 1;
	}

	
	

}
