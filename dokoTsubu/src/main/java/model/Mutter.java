package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	
	private String id;
	private String name;
	private String text;
	
	public Mutter() { }
	
	public Mutter(String id, String name, String text) {
		this.id = id;
		this.name = name;
		this.text = text;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getText() {
		return text;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
