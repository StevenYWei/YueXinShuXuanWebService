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
	public List<ShoppingCart> getShoppingCartById(Integer shoppingCartId) {
		return shoppingCartDAO.getShoppingCartById(shoppingCartId);
	}

	@Override
	public int addToCart(Integer shoppingCartId, Integer bookId) {
		shoppingCartDAO.addToCart(shoppingCartId, bookId);
		return 1;
	}

	@Override
	public int updateItemStatus(Integer shoppingCartId, Integer bookId, String status) {
		shoppingCartDAO.updateItemStatus(shoppingCartId, bookId, status);
		return 1;
	}

	@Override
	public int removeItem(Integer shoppingCartId, Integer bookId) {
		shoppingCartDAO.removeItem(shoppingCartId, bookId);
		return 1;
	}

}
