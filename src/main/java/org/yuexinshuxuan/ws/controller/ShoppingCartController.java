package org.yuexinshuxuan.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.entity.ShoppingCart;
import org.yuexinshuxuan.ws.service.ShoppingCartService;

@RestController
@RequestMapping(value="/shopCart")
public class ShoppingCartController {

	@Autowired
	ShoppingCartService shoppingCartService;
	
	@GetMapping("/getShopingCart/{shoppingCartId}")
	public List<ShoppingCart> getShoppingCartById(@PathVariable Integer shoppingCartId) {

		return shoppingCartService.getShoppingCartById(shoppingCartId);
	}
	
	@GetMapping("/addShopingCart")
	public void addToCart(@RequestParam(value = "shoppingCartId") Integer shoppingCartId, @RequestParam(value = "bookId") Integer bookId) {
		shoppingCartService.addToCart(shoppingCartId, bookId);
	}

	@GetMapping("/updateItemStatus")
	public void updateItemStatus(@RequestParam(value = "shoppingCartId") Integer shoppingCartId, @RequestParam(value = "bookId") Integer bookId, @RequestParam(value = "status") String status) {
		shoppingCartService.updateItemStatus(shoppingCartId, bookId, status);
	}

	@GetMapping("/removeItem")
	public void removeItem(@RequestParam(value = "shoppingCartId") Integer shoppingCartId, @RequestParam(value = "bookId") Integer bookId) {
		shoppingCartService.removeItem(shoppingCartId, bookId);
	}

}
