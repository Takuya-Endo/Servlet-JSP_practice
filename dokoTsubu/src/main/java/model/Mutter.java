package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	
	private String id;
	private String userName;
	private String text;
	
	public Mutter() { }
	
	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}
	
	public String getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
