package com.js.sign;

public class Info {
	
	private String id;
	private String pw;
	private String fName;
	private int age;

	public Info() {
		// TODO Auto-generated constructor stub
	}

	public Info(String id, String pw, String fName, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.fName = fName;
		this.age = age;
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

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	


}
