package org.yuexinshuxuan.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shpn_cart")
public class ShoppingCart implements Serializable {

	private static final long serialVersionUID = 1936208378726116700L;

	public ShoppingCart() {}

	@Id
	@Column(name = "shpn_cart_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shoppingCartId;

	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "book_id", nullable = false)
	private Integer bookId;

	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "stts_cd", nullable = false)
	private String sttsCode;

	protected Integer getShoppingCartId() {
		return shoppingCartId;
	}

	protected void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	protected Integer getBookId() {
		return bookId;
	}

	protected void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	protected String getSttsCode() {
		return sttsCode;
	}

	protected void setSttsCode(String sttsCode) {
		this.sttsCode = sttsCode;
	}

}
