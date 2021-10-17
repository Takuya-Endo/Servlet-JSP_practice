package health.model;

import java.io.Serializable;

public class Health implements Serializable {
	
	private String height;
	private String weight;
	
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
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
