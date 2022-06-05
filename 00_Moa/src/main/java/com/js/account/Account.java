package com.js.account;

public class Account {

	private String name;
	private int byear;
	private int bmonth;
	private int bday;
	private String id;
	private String pw;
	private String email;
	private String gender;
	private String addr;
	private String phone;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String name, int byear, int bmonth, int bday, String id, String pw, String email, String gender,
			String addr, String phone) {
		super();
		this.name = name;
		this.byear = byear;
		this.bmonth = bmonth;
		this.bday = bday;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.gender = gender;
		this.addr = addr;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	public int getBmonth() {
		return bmonth;
	}

	public void setBmonth(int bmonth) {
		this.bmonth = bmonth;
	}

	public int getBday() {
		return bday;
	}

	public void setBday(int bday) {
		this.bday = bday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
