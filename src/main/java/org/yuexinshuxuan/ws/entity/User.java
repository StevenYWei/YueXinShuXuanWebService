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
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 5193423684813432669L;

	public User() {}
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column(name = "user_nm", nullable = false)
	private String userName;
	
	@Column(name = "user_pw", nullable = false)
	private String userPassword;

	@Column(name = "user_cd", nullable = true)
	private String userCode;
	
	@Column(name = "active_fl", nullable = true)
	private String activeFlag;
	
	@Column(name = "first_nm", nullable = true)
	private String firstName;

	@Column(name = "middle_nm", nullable = true)
	private String middleName;

	@Column(name = "last_nm", nullable = true)
	private String lastName;
	
	@Column(name = "email_addr", nullable = true)
	private String email;
	
	@Column(name = "phone_nb", nullable = true)
	private String phoneNumber;
	
	@Column(name = "dob", nullable = true)
	private Calendar DateOfBirth;
	
	@Column(name = "addr1", nullable = true)
	private String address1;
	
	@Column(name = "addr2", nullable = true)
	private String address2;
	
	@Column(name = "city", nullable = true)
	private String city;

	@Column(name = "state", nullable = true)
	private String state;
	
	@Column(name = "country", nullable = true)
	private String country;

	@Column(name = "zip", nullable = true)
	private String zip;

	@Column(name = "user_creat_dt", nullable = true)
	private Calendar createDate;


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Calendar getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}
	

}
