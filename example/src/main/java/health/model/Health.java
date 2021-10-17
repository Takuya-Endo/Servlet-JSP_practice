package health.model;

import java.io.Serializable;

public class Health implements Serializable {
	
	private String height;
	private String weight;
	private String bmi;
	private String shape;
	
	public Health() { }
	
	public Health(String height, String weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public String getHeight() {
		return this.height;
	}
	
	public String getWeight() {
		return this.weight;
	}
	
	public String getBmi() {
		return this.bmi;
	}
	
	public String getShape() {
		return this.shape;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}

}
