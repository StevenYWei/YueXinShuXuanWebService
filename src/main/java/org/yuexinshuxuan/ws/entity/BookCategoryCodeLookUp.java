package org.yuexinshuxuan.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_category_cd_lk")
public class BookCategoryCodeLookUp {

	public BookCategoryCodeLookUp() {}
	
	@Id
	@Column(name = "category_cd", nullable=false, unique=true)
	private String categoryCode;
	
	@Column(name = "code_desc")
	private String codeDescription;

	protected String getCategoryCode() {
		return categoryCode;
	}

	protected void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	protected String getCodeDescription() {
		return codeDescription;
	}

	protected void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}
	
	

}
