package org.yuexinshuxuan.ws.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	
	public Book() {}
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer book_id;
	
	@Column(name = "category_cd")
	private String category_cd;
	
	@Column(name = "book_name")
	private String book_name;
	
	@Column(name = "book_time")
	private Calendar book_time;

	@Column(name = "author")
	private String author;
	
	@Column(name = "book_desc")
	private String book_desc;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "pic")
	private Byte[] pic;

	
	protected Integer getBook_id() {
		return book_id;
	}

	protected void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	protected String getCategory_cd() {
		return category_cd;
	}

	protected void setCategory_cd(String category_cd) {
		this.category_cd = category_cd;
	}

	protected String getBook_name() {
		return book_name;
	}

	protected void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	protected Calendar getBook_time() {
		return book_time;
	}

	protected void setBook_time(Calendar book_time) {
		this.book_time = book_time;
	}

	protected String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}

	protected String getBook_desc() {
		return book_desc;
	}

	protected void setBook_desc(String book_desc) {
		this.book_desc = book_desc;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected Byte[] getPic() {
		return pic;
	}

	protected void setPic(Byte[] pic) {
		this.pic = pic;
	}

	
	
}
