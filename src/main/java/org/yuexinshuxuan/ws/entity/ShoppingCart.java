package org.yuexinshuxuan.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shpn_cart")
public class ShoppingCart implements Serializable {

	private static final long serialVersionUID = -6951709795705816619L;

	public ShoppingCart() {}

	@Id
	@Column(name = "shpn_cart_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shoppingCartId;

	@Column(name = "user_id", nullable = false)
	private Integer userId;

	@Column(name = "book_id", nullable = false)
	private Integer bookId;

	@Column(name = "count", nullable = true)
	private String count;
	
	@Column(name = "stts_cd", nullable = true)
	private String sttsCode;

	public Integer getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getSttsCode() {
		return sttsCode;
	}

	public void setSttsCode(String sttsCode) {
		this.sttsCode = sttsCode;
	}

}
