package org.yuexinshuxuan.ws.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable{
	
	private static final long serialVersionUID = 2258814395842174475L;

	public Book() {}
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	
	@Column(name = "category_cd")
	private String categoryCode;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_time")
	private Calendar bookTime;

	@Column(name = "author")
	private String author;
	
	@Column(name = "book_desc")
	private String bookDescription;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "pic")
	private Byte[] pic;
	

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Calendar getBookTime() {
		return bookTime;
	}

	public void setBookTime(Calendar bookTime) {
		this.bookTime = bookTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Byte[] getPic() {
		return pic;
	}

	public void setPic(Byte[] pic) {
		this.pic = pic;
	}
	
	
}
