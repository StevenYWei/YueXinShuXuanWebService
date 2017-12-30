package org.yuexinshuxuan.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.entity.ShoppingCart;
import org.yuexinshuxuan.ws.service.ShoppingCartService;

@RestController
@RequestMapping(value = "/shopCart")
public class ShoppingCartController {

	@Autowired
	ShoppingCartService shoppingCartService;

	@GetMapping("/getShoppingCart/{shoppingCartId}")
	public ShoppingCart getShoppingCartById(@PathVariable Integer shoppingCartId) {
		return shoppingCartService.getShoppingCartById(shoppingCartId);
	}

	@GetMapping("/getShoppingCartList/{userId}")
	public List<ShoppingCart> getShoppingCartByUser(@PathVariable Integer userId) {
		return shoppingCartService.getShopingCartByUserId(userId);
	}

//	@GetMapping("/addToCart")
//	public void addToCart(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "bookId") Integer bookId) {
//		shoppingCartService.addToCart(userId, bookId);
//	}
	
	@PostMapping("/addToCart")
	public void addToCart(@RequestBody ShoppingCart shoppingCart) {
		shoppingCartService.addToCart(shoppingCart);
	}

	@GetMapping("/updateItemStatus")
	public void updateItemStatus(@RequestParam(value = "shoppingCartId") Integer shoppingCartId,
			@RequestParam(value = "status") String status) {
		shoppingCartService.updateItemStatus(shoppingCartId, status);
	}

	@GetMapping("/removeItemById")
	public void removeItemById(@RequestParam(value = "shoppingCartId") Integer shoppingCartId) {
		shoppingCartService.removeItemById(shoppingCartId);
	}

	@GetMapping("/removeItemByUser")
	public void removeItemByUser(@RequestParam(value = "userId") Integer userId) {
		shoppingCartService.removeByUserId(userId);
	}

}
