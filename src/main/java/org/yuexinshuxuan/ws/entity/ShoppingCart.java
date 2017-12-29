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

	private static final long serialVersionUID = 1936208378726116700L;

	public ShoppingCart() {}

	@Id
	@Column(name = "shpn_cart_id")
	private Integer shoppingCartId;

	@Id
	@Column(name = "book_id", nullable = false)
	private Integer bookId;

	@Column(name = "stts_cd", nullable = false)
	private String sttsCode;

	public Integer getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getSttsCode() {
		return sttsCode;
	}

	public void setSttsCode(String sttsCode) {
		this.sttsCode = sttsCode;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	

}
