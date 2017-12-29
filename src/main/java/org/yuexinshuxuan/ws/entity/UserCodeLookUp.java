package org.yuexinshuxuan.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_cd_lk")
public class UserCodeLookUp {

	public UserCodeLookUp() {}
	
	@Id
	@Column(name = "user_cd", nullable=false, unique=true)
	private String userCode;
	
	@Column(name = "code_desc")
	private String codeDescription;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userCode")
	private User user;

	protected String getUserCode() {
		return userCode;
	}

	protected void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	protected String getCodeDescription() {
		return codeDescription;
	}

	protected void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}
	
	

}
